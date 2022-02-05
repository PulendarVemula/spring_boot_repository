package com.createiq.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createiq.ems.model.Employee_05;
import com.createiq.ems.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository ;

	@Override
	public Employee_05 AddEmp(Employee_05 employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee_05> find_All() {

		return employeeRepository.findAll();
	}

	@Override
	public List<Employee_05> AddEmps(Employee_05 employees) {

		return (List<Employee_05>) employeeRepository.save(employees);
	}

	@Override
	public Employee_05 findNById(Integer eid) {

		return employeeRepository.findNById(eid);
	}

	@Override
	public Double findSal(Integer eid) {

		return employeeRepository.findSal(eid);
	}

}
