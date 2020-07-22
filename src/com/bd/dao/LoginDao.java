package com.bd.dao;
import com.bd.pojo.Admin;
import com.bd.pojo.Student;
import com.bd.pojo.Teacher;
public interface LoginDao {
	//根据用户名查找管理员
	public Admin findAdminByUsername(Admin admin);
	//根据用户名查找老师
	public Teacher findTeachByUsername(Teacher teacher);
	//根据用户名查找学生
	public Student findStuByUsername(Student student);
}
