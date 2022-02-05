package com.createiq.ems.service;

import java.util.List;

import com.createiq.ems.entity.Employee;

public interface EmployeeService {

	
	public void add(Employee employee);
	
	public void update(Employee employee);
	
	public void delete(Integer eid);
	
	Employee findById(Integer eid);
	
	List<Employee> findAll();
	
	List<Employee> findByName(String ename);
	
	List<Employee> findByNameAndSalary(String ename , Double esalary);
}
