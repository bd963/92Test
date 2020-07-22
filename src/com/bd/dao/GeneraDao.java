package com.bd.dao;

import com.bd.pojo.Student;
import com.bd.pojo.Teacher;

public interface GeneraDao {
	//根据id修改老师密码
	public void updatepw(Teacher teacher);
	//根据id修改学生分数
	public void updatescore(Student student);
	//根据id修改学生密码 
	public void updatepws(Student student);
}
