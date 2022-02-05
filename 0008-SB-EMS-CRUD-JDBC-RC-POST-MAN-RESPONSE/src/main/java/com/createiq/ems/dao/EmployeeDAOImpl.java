package com.createiq.ems.dao;

import java.sql.Types;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.createiq.ems.model.Employee;

@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void add(Employee employee) {

		jdbcTemplate.update("INSERT INTO EMPLOYEE_03 VALUES(?,?,?)" ,new Object[] {employee.getEid() , employee.getEname() , employee.getEsalary()});
	}

	public void update(Employee employee) {

		jdbcTemplate.update("UPDATE EMPLOYEE_03 SET ENAME = ? , ESALARY = ? WHERE EID = ?" , new Object[] {employee.getEname(),employee.getEsalary(),employee.getEid()});
	}

	public void delete(Integer eid) {

		jdbcTemplate.update("DELETE FROM EMPLOYEE_03 WHERE EID = ?" , new Object[] {eid});
	}

	public List<Employee> findAll() {

		return jdbcTemplate.query("SELECT * FROM EMPLOYEE_03", new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	public Employee findById(Integer eid) {

		return jdbcTemplate.queryForObject("SELECT * FROM EMPLOYEE_03 WHERE EID = ?",  new Object[] {eid},new int [] {Types.INTEGER},new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	public List<Employee> findByName(String ename) {

		return jdbcTemplate.query("SELECT * FROM EMPLOYEE_03 WHERE ENAME = ?", new Object[] {ename} , new int[] {Types.VARCHAR},new BeanPropertyRowMapper<Employee>(Employee.class));
	}

}
