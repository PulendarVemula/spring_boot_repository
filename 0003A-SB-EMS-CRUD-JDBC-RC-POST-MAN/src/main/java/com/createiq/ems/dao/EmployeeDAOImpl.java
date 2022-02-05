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

	@Override
	public void add(Employee employee) {

		jdbcTemplate.update("INSERT INTO EMPLOYEE_02 VALUES (?,?,?)",new Object[] {employee.getEid() , employee.getEname() , employee.getEsalary()});
		
	}

	@Override
	public void update(Employee employee) {

		jdbcTemplate.update("UPDATE EMPLOYEE_02 SET ENAME = ? ,ESALARY = ? WHERE EID = ?" , new Object[] {employee.getEname() , employee.getEsalary() , employee.getEid()});
	}

	@Override
	public void deleteById(Integer eid) {

		jdbcTemplate.update("DELETE FROM EMPLOYEE_02 WHERE EID = ?" ,  new Object[] {eid});
	}

	@Override
	public List<Employee> findAll() {

		return jdbcTemplate.query("SELECT * FROM EMPLOYEE_02", new BeanPropertyRowMapper<Employee>(Employee.class));
	}


	@Override
	public Employee findById(Integer eid) {

		return jdbcTemplate.queryForObject("SELECT * FROM EMPLOYEE_02 WHERE EID = ?" , new Object[] {eid} , new int [] {Types.INTEGER},new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	@Override
	public List<Employee> findByName(String ename) {

		return jdbcTemplate.query("SELECT * FROM EMPLOYEE_02 WHERE ENAME = ?" , new Object[] {ename} , new int [] {Types.VARCHAR},new BeanPropertyRowMapper<Employee>(Employee.class));
	}

}
