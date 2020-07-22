package com.bd.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bd.dao.LoginDao;
import com.bd.pojo.Admin;
import com.bd.pojo.Student;
import com.bd.pojo.Teacher;
@Component
public class LoginService {
	@Autowired
	private LoginDao loginDao;
	public Admin findAdminById(Admin admin) {
		return this.loginDao.findAdminByUsername(admin);
	}
	public Teacher findTeachByUsername(Teacher teacher) {
		return this.loginDao.findTeachByUsername(teacher);
	}
	public Student findStuTeachByUsername(Student student) {
		return this.loginDao.findStuByUsername(student);
	}
}
