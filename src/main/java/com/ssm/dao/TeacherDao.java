package com.ssm.dao;

import com.ssm.entity.Student;

import java.util.List;

/**
 * Created by Administrator on 2016/6/27.
 */
public interface TeacherDao {

    //通过老师ID查询学生，并携带老师实体
    List<Student> queryStudentWithTeacher(long tid);
}
