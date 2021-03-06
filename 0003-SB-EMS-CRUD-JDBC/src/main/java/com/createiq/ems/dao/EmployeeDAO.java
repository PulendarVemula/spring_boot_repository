package com.createiq.ems.dao;

import java.util.List;

import com.createiq.ems.model.Employee;

public interface EmployeeDAO {

	public void add(Employee employee);
	
	public void update(Employee employee);
	
	public void deleteById(Integer eid);
	
	List<Employee> findAll();
	
	List<Employee> findByName(String ename);
	
	Employee findById(Integer eid);
}
