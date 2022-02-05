package com.createiq.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.createiq.ems.model.Employee_05;
import com.createiq.ems.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/add")
	public ResponseEntity<?> AddEmployee(@RequestBody Employee_05 employee){
		return new ResponseEntity<>(employeeService.AddEmp(employee),HttpStatus.OK);
	}
	@PostMapping("/addEmps")
	public ResponseEntity<?> AddEmployees(@RequestBody Employee_05 employees){
		return new ResponseEntity<>(employeeService.AddEmp(employees),HttpStatus.OK);
	}
	@GetMapping("/findall")
	public ResponseEntity<?> findall(){
		return new ResponseEntity<>(employeeService.find_All(),HttpStatus.FOUND);
	}
	
	@GetMapping("/findNameById/{eid}")
	public ResponseEntity<?> findNameById(@PathVariable("eid") Integer eid){
		return new ResponseEntity<>(employeeService.findNById(eid),HttpStatus.FOUND);
	}
	
	@GetMapping("/findSalById/{eid}")
	public ResponseEntity<?> findSal(@PathVariable("eid") Integer eid){
		
		return new ResponseEntity<>(employeeService.findSal(eid), HttpStatus.FOUND);
		
	}

}
