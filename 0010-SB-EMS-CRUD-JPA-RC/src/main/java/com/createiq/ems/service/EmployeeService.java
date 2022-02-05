package com.createiq.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createiq.ems.dao.EmployeeDAO;
import com.createiq.ems.model.Employee;

@Service("empService")
public class EmployeeService{
	
	@Autowired
	private EmployeeDAO employeeDAO;

	public void add(Employee employee) {

		employeeDAO.save(employee);
		
	}

	public Employee update(Employee employee) {

		Employee existingEmployee = employeeDAO.findById(employee.getEid()).orElse(null);
		
		existingEmployee.setEname(employee.getEname());
		existingEmployee.setEsalary(employee.getEsalary());
		
		return employeeDAO.save(existingEmployee);
		
		
	}

	public void delete(Integer eid) {

		employeeDAO.deleteById(eid);
	}

	public List<Employee> findAll() {

		return employeeDAO.findAll();
	}

	public Employee findById(Integer eid) {

		return employeeDAO.findById(eid).orElse(null);
	}

//	public List<Employee> findByName(String ename) {
//
//		return employeeDAO.findByName(ename);
//	}

}
