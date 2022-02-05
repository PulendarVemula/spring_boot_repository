package com.createiq.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createiq.ems.entity.Employee;
import com.createiq.ems.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository; 

	@Override
	public void add(Employee employee) {

		employeeRepository.save(employee);
	}

	@Override
	public void update(Employee employee) {

		Employee existingEmployee = employeeRepository.findById(employee.getEid()).get();
		
		existingEmployee.setEname(employee.getEname());
		existingEmployee.setEsalary(employee.getEsalary());
		
		employeeRepository.save(existingEmployee);
	}

	@Override
	public void delete(Integer eid) {

		employeeRepository.deleteById(eid);
	}

	@Override
	public Employee findById(Integer eid) {

		return employeeRepository.getById(eid);
	}

	@Override
	public List<Employee> findAll() {

		return employeeRepository.findAll();
	}

	@Override
	public List<Employee> findByName(String ename) {

		return employeeRepository.findByEname(ename);
	}

	@Override
	public List<Employee> findByNameAndSalary(String ename, Double esalary) {

		return employeeRepository.findByEnameAndEsalary(ename , esalary);
	}

}
