package com.createiq.ems.controller;


import org.springframework.beans.factory.annotation.Autowired;
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

import com.createiq.ems.entity.Employee;
import com.createiq.ems.service.EmployeeService;

@RestController
@RequestMapping("/EmP")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService; 
	
	@PostMapping("/addEmployee")
	public String addEmployee(@RequestBody Employee employee){
		
		employeeService.add(employee);
		
		return "Employee inserted successfully";
	}
	
	@PutMapping("/updateEmployee")
	public String updateEmployee(@RequestBody Employee employee) {
		
		employeeService.update(employee);
		
		return "Employee updated successfully";
	}
	
	@DeleteMapping("/delete/{eid}")
	public String deleteById(@PathVariable("eid") Integer eid) {
		
		employeeService.delete(eid);
		
		return "Record with id : "+eid+"deleted syuccessfully";
	}
	
	@GetMapping("/allEmployees")
	public ResponseEntity<?> allEmployees(){
		
		
		return new ResponseEntity<>(employeeService.findAll(), HttpStatus.FOUND);
		
	}
	@GetMapping("/findByiD/{eid}")
	public ResponseEntity<?> findById(@PathVariable("eid") Integer eid){
		
		return new ResponseEntity<>(employeeService.findById(eid), HttpStatus.FOUND);
	}
	
	@GetMapping("/findByNaMe/{ename}")
	public ResponseEntity<?> findByName(@PathVariable("ename") String ename){
		
		ResponseEntity<?> responseEntity = null;
		
		try {
			
		responseEntity = new ResponseEntity<>(employeeService.findByName(ename), HttpStatus.FOUND);
			
		}catch(Exception e){
			
			responseEntity = new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return responseEntity;
	}
	
	@GetMapping("/findByNaMeAndS/{ename}/{esalary}")
	public ResponseEntity<?> findByNameAndSalary(@PathVariable("ename") String ename , @PathVariable("esalary") Double esalary){
		
		return new ResponseEntity<>(employeeService.findByNameAndSalary(ename, esalary), HttpStatus.FOUND);
	}
	
}
