package com.createiq.ems.service;

import java.util.List;

import com.createiq.ems.model.Employee_05;

public interface EmployeeService {
	public Employee_05 AddEmp(Employee_05 employee);
	public List<Employee_05> find_All();
	public List<Employee_05> AddEmps(Employee_05 employees);
 
	public Employee_05 findNById(Integer eid);
	public Double findSal(Integer eid);
}
