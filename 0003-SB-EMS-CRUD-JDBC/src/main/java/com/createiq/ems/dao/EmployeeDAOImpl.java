package com.createiq.ems.dao;

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

		jdbcTemplate.update("INSERT INTO EMPLOYEE_01 VALUES(?,?,?)" , new Object[] {employee.getEid(),employee.getEname(),employee.getEsalary()});
		
	}

	@Override
	public void update(Employee employee) {

		jdbcTemplate.update("UPDATE EMPLOYEE_01 SET ENAME = ? , ESALARY = ? WHERE EID = ?", new Object[] {employee.getEname() , employee.getEsalary() , employee.getEid()});
		
	}

	@Override
	public void deleteById(Integer eid) {

		jdbcTemplate.update("DELETE FROM EMPLOYEE_01 WHERE EID = ?", new Object[] {eid});
		
	}

	@Override
	public List<Employee> findAll() {
		
		System.out.println("All Employees Details");

		return jdbcTemplate.query("SELECT * FROM EMPLOYEE_01", new BeanPropertyRowMapper(Employee.class));
	}

	@Override
	public List<Employee> findByName(String ename) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findById(Integer eid) {
		

		return (Employee) jdbcTemplate.queryForObject("SELECT * FROM EMPLOYEE_01 WHERE EID = ?",new Object[] {eid} , new BeanPropertyRowMapper(Employee.class) );
	}

}
