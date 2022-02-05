package com.createiq.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/Emp")
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/allEmployees")
	public List<Employee> allEmployees() {
		
		return employeeService.findAll();
		
	}
	
	@GetMapping("/findByiD/{eid}")
	public Employee findByiD(@PathVariable("eid") Integer eid) {
		
		return employeeService.findById(eid);
		
	}
	
	@DeleteMapping("/delete/{eid}")
	public String delete(@PathVariable("eid") Integer eid) {
		
		employeeService.deleteById(eid);
		
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
		
		return "Record successfully updated";
		
	}
	
	@GetMapping("/findByNaMe/{ename}")
	public List<Employee> findByName(@PathVariable("ename") String ename){
		
		return employeeService.findByName(ename);
		
	}
	
	
}
