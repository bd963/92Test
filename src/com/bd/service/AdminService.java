package com.bd.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bd.dao.AdminDao;
import com.bd.pojo.Admin;
import com.bd.pojo.Page;
import com.bd.pojo.Student;
import com.bd.pojo.Teacher;
@Component
public class AdminService {
	@Autowired
	private AdminDao adminDao;
	//学生
	//分页
	public List<Student> liststudent(Page page){
		return this.adminDao.liststudent(page);
	}
	public void addStudent(Student student) {
		this.adminDao.addStudent(student);
	}
	public Student selectone(String id) {
		return adminDao.selectone(id);
	};
	public List<Student> stumanage() {
		return this.adminDao.stumanage();
	}
	public void delstudnet(String id) {
		this.adminDao.delstudnet(id);
	}
	public void updatestu(Student student) {
		this.adminDao.updatestu(student);
	};
	public List<Student> selectbyname(String stuname){
		return this.adminDao.selectbyname(stuname);
	}
	
	//老师
	public void addteacher(Teacher teacher) {
		this.adminDao.addteacher(teacher);
	};
	public Teacher selectonetea(String id) {
		return this.adminDao.selectonetea(id);
	}
	public List<Teacher> teamanage(){
		return this.adminDao.teamanage();
	}
	public void delteacher(String id){
		this.adminDao.delteacher(id);
	}
	public void updatetea(Teacher teacher) {
		this.adminDao.updatetea(teacher);
	};
	public List<Teacher> selectbynametea(String teaname){
		return this.adminDao.selectbynametea(teaname);
	}
	
	//管理员
	//添加一个管理员
	public void addAdmin(Admin admin){
		this.adminDao.addAdmin(admin);
	}
	//查询所有管理员信息
	public List<Admin> adminree(){
		return this.adminDao.adminree();
	}
	//查询一条管理员信息
	public Admin selectoneade(String id){
		return this.adminDao.selectoneade(id);
	}
	//模糊查询管理员信息
	public List<Admin> selectbynameade(String aderty){
		return this.adminDao.selectbynameade(aderty);
	}
}