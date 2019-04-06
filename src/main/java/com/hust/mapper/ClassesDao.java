package com.hust.mapper;

import com.hust.bean.Classes;
import com.hust.bean.PageInfo;
import com.hust.bean.Student;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface ClassesDao {


    @MapKey("name")
    Map<String,Student> queryByFileds(String name,String dec);

    List<Student> queryByFiledsAndPage(@Param("stu") Student student,
                                       @Param("pageInfo") PageInfo pageInfo);
}
