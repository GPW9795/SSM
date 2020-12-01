package com.gpw.dao;

import com.gpw.bean.Teacher;

import java.util.List;

public interface TeacherDao {
    Teacher getTeacherById(Integer id);

    List<Teacher> getTeacherByCondition(Teacher teacher);

    List<Teacher> getTeacherByConditionChoose(Teacher teacher);

    List<Teacher> getTeacherByIdIn(List<Integer> list);

    int updateTeacher(Teacher teacher);
}
