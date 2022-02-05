package com.createiq.ems.service;

import java.util.List;

import com.createiq.ems.model.Employee;

public interface EmployeeService {
	
public void add(Employee employee);
	
	public void update(Employee employee);
	
	public void delete(Integer eid);
	
	List<Employee> findAll();
	
	Employee findById(Integer eid);
	
	List<Employee> findByName(String ename);

}
