package com.bd.dao;
import java.util.List;

import com.bd.pojo.Admin;
import com.bd.pojo.Page;
import com.bd.pojo.Student;
import com.bd.pojo.Teacher;
public interface AdminDao {
	//学生
	//添加一条学生信息
	public void addStudent(Student student);
	//根据id获取一个学生信息
	public Student selectone(String id);
	//获得全部学生信息
	public List<Student> stumanage();
	//根据id删除一条学生信息
	public void delstudnet(String id);
	//修改一条学生信息
	public void updatestu(Student student);
	//根据学生姓名模糊查询
	public List<Student> selectbyname(String stuname);
	//分页
	public List<Student> liststudent(Page page);
	//老师
	//添加一条老师信息
	public void addteacher(Teacher teacher);
	//查询一个老师信息
	public Teacher selectonetea(String id);
	//查询所有老师信息
	public List<Teacher> teamanage();
	//删除一个老师信息
	public void delteacher(String id);
	//修改一个老师信息
	public void updatetea(Teacher teacher);
	//模糊查询老师信息
	public List<Teacher> selectbynametea(String teaname);
	//管理员
	//添加管理员
	public void addAdmin(Admin admin);
	//查询所有管理员信息
	public List<Admin> adminree();
	//查询一个管理员信息
	public Admin selectoneade(String id);
	//模糊查询管理信息
	public List<Admin> selectbynameade(String aderty);
}
