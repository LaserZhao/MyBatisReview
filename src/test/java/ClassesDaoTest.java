import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hust.bean.PageInfo;
import com.hust.bean.Student;
import com.hust.mapper.MapperDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class ClassesDaoTest {

    private static SqlSession sqlSession;
    private static MapperDao mapper;
    private static Gson gson;
    @BeforeClass
    public static void initSession() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        sqlSession = sqlSessionFactory.openSession(true);
        mapper = sqlSession.getMapper(MapperDao.class);
        gson = new GsonBuilder().setPrettyPrinting().create();
    }
    @Test
    public void test(){
        Map<String, Student> stringStudentMap = mapper.queryByFileds("description","h");
        //sqlSession.close();
        System.out.println(gson.toJson(stringStudentMap));
    }

    @Test
    public void test1() {
        Map<String, List<Student>> stringStudentMap = mapper.queryByFiled("description", "h");
        //sqlSession.close();
        System.out.println(gson.toJson(stringStudentMap));
    }

    @Test
    public void test2() {
        Student student = new Student(10,"wu","h");
        PageInfo PageInfo = new PageInfo(1,2);

        List<Student> students = mapper.queryByFiledsAndPage(student, PageInfo);
        System.out.println(gson.toJson(students));
    }
}
