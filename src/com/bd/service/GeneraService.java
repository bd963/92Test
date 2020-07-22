package com.bd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bd.dao.GeneraDao;
import com.bd.pojo.Student;
import com.bd.pojo.Teacher;
@Component
public class GeneraService {
	@Autowired
	private GeneraDao generaDao;
	public void updatepw(Teacher teacher) {
		this.generaDao.updatepw(teacher);
	}
	public void updatescore(Student student) {
		this.generaDao.updatescore(student);
	}
	public void updatepws(Student student) {
		this.generaDao.updatepws(student);
	}
}
