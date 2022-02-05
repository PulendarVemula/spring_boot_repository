package com.createiq.ems.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.createiq.ems.model.Employee_05;

public interface EmployeeRepository extends JpaRepository<Employee_05, Integer>{
	
	@Query(name = "findNameById")
	Employee_05 findNById(@Param("eid") Integer eid);

	@Query(name = "findSalById")
	public Double findSal(@Param("eid") Integer eid);
}
