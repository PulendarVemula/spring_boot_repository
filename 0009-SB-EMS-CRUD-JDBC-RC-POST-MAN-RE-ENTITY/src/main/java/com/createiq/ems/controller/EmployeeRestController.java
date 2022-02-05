package com.createiq.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.createiq.ems.model.Employee;
import com.createiq.ems.service.EmployeeService;

@RestController
@RequestMapping("/emPloyee")
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/allEmployees")
	public ResponseEntity<?> allEmployees() {
		
		return new ResponseEntity<>( employeeService.findAll() , HttpStatus.FOUND);
		
	}
	@GetMapping("/findByiD/{eid}")
    public ResponseEntity<?> findById(@PathVariable("eid") Integer eid) {
		
		ResponseEntity<?> responseEntity = null;
		try {
		responseEntity =  new ResponseEntity<>( employeeService.findById(eid) , HttpStatus.FOUND);
		}catch (EmptyResultDataAccessException e) {

			responseEntity = new ResponseEntity<>("Record not found", HttpStatus.NOT_FOUND);
		}catch (Exception e) {
           responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return responseEntity;
	}
	@GetMapping("/findByNaMe/{ename}")
	public ResponseEntity<?> findByName(@PathVariable("ename") String ename) {
		
		return new ResponseEntity<>(employeeService.findByName(ename) , HttpStatus.FOUND);
	}
	@DeleteMapping("/deletE/{eid}")
	public String deleteEmp(@PathVariable("eid") Integer eid) {
		
		employeeService.delete(eid);
		
		return "Record with id : "+eid+" deleted successfully";
		
	}
	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee employee) {
		
		employeeService.add(employee);
		
		return "Record inserted successfully";
		
	}
	@PutMapping("/updateEmployee")
	public String updateEmployee(@RequestBody Employee employee) {
		
		employeeService.update(employee);
		
		return "Record updated successfully ";
		
	}
}
