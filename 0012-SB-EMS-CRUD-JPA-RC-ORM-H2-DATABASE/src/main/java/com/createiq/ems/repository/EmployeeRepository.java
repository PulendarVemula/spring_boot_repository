package com.createiq.ems.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.createiq.ems.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	List<Employee> findByEname(String ename);

	List<Employee> findByEnameAndEsalary(String ename, Double esalary);

	
}
