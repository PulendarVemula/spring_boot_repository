package com.createiq.sms.dao;

import java.sql.Types;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.createiq.sms.model.Student;

@Repository("stdDAO")
public class StudentDAOImpl implements StudentDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void add(Student student) {

		jdbcTemplate.update("INSERT INTO STUDENT_02 VALUES (?,?,?,?)" , new Object[] {student.getSid() , student.getSname() , student.getSfee() , student.getSaddress()});
		
	}

	@Override
	public void update(Student student) {

		jdbcTemplate.update("UPDATE STUDENT_02 SET SNAME = ? , SFEE = ? , SADDRESS = ? WHERE SID = ?" , new Object[] {student.getSname() , student.getSfee() , student.getSaddress() , student.getSid()});
	}

	@Override
	public void deleteById(Integer sid) {

		jdbcTemplate.update("DELETE FROM STUDENT_02 WHERE SID = ?" , new Object[] {sid});
	}

	@Override
	public List<Student> findAll() {

		return jdbcTemplate.query("SELECT * FROM STUDENT_02", new BeanPropertyRowMapper<Student>(Student.class));
	}

	@Override
	public List<Student> findByName(String sname) {
		
		return (List<Student>) jdbcTemplate.query("SELECT * FROM STUDENT_02 WHERE SNAME = ?", new Object[] {sname},new int[] {Types.VARCHAR}, new BeanPropertyRowMapper<Student>(Student.class));
	}

	@Override
	public Student findById(Integer sid) {

		return jdbcTemplate.queryForObject("SELECT * FROM STUDENT_02 WHERE SID = ?", new Object[] {sid},new int [] {Types.INTEGER}, new BeanPropertyRowMapper<Student>(Student.class));
	}

	

}
