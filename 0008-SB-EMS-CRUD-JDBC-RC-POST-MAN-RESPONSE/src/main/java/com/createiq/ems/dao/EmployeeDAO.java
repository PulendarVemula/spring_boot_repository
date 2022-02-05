package com.createiq.ems.dao;

import java.util.List;

import com.createiq.ems.model.Employee;

public interface EmployeeDAO {
	
	public void add(Employee employee);
	
	public void update(Employee employee);
	
	public void delete(Integer eid);
	
	List<Employee> findAll();
	
	Employee findById(Integer eid);
	
	List<Employee> findByName(String ename);
}
