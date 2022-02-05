package com.createiq.ems.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.createiq.ems.model.Employee;

@Repository
public interface EmployeeDAO extends JpaRepository<Employee, Integer>{


//	void update(Employee employee);

//	List<Employee> findByName(String ename);
	
}