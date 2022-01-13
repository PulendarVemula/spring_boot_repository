package com.createiq.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createiq.sms.dao.StudentDAO;
import com.createiq.sms.model.Student;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDAO studentDAO;

	@Override
	public void add(Student student) {

		studentDAO.add(student);
		
	}

	@Override
	public void update(Student student) {

		studentDAO.update(student);
	}

	@Override
	public void deleteById(Integer sid) {

		studentDAO.deleteById(sid);
	}

	@Override
	public List<Student> findAll() {

		return studentDAO.findAll();
	}

	@Override
	public Student findById(Integer sid) {

		return studentDAO.findById(sid);
	}

}
