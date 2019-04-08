package com.hust.mapper;

import com.hust.bean.PageInfo;
import com.hust.bean.Student;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface MapperDao {

    //  不支持该种形式的返回封装
    @MapKey("name")
    Map<String, List<Student>> queryByFiled(String filed, String value);

    @MapKey("name")
    Map<String, Student> queryByFileds(String filed, String value);

    List<Student> queryByFiledsAndPage(@Param("stu") Student student,
                                       @Param("pageInfo") PageInfo pageInfo);
}
