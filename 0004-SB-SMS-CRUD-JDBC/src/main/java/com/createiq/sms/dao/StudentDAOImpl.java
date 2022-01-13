package com.createiq.sms.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.createiq.sms.model.Student;

@Repository
public class StudentDAOImpl implements StudentDAO{
	
	@Autowired
	private JdbcTemplate  jdbcTemplate;

	@Override
	public void add(Student student) {

		jdbcTemplate.update("INSERT INTO STUDENT_01 VALUES(?,?,?)" , new Object[] {student.getSid() , student.getSname() , student.getSaddress()});
	}

	@Override
	public void update(Student student) {

		jdbcTemplate.update("UPDATE STUDENT_01 SET SNAME = ? , SADDRESS = ? WHERE SID = ?" , new Object[] {student.getSname() , student.getSaddress(),student.getSid()});
	}

	@Override
	public void deleteById(Integer sid) {

		jdbcTemplate.update("DELETE FROM STUDENT_01 WHERE SID = ?" , new Object[] {sid});
	}

	@Override
	public List<Student> findAll() {

		return jdbcTemplate.query("SELECT * FROM STUDENT_01", new BeanPropertyRowMapper(Student.class));
	}

	@Override
	public Student findById(Integer sid) {

		return (Student) jdbcTemplate.queryForObject("SELECT * FROM STUDENT_01 WHERE SID = ?", new Object[] {sid}, new BeanPropertyRowMapper(Student.class));
	}

}
