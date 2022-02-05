package com.createiq.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.createiq.ems.model.Employee;
import com.createiq.ems.model.ResponseBean;
import com.createiq.ems.service.EmployeeService;

@RestController
@RequestMapping("/emP")
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/allEmployees")
	public ResponseBean allEmployees() {

		return new ResponseBean(320, employeeService.findAll());

	}

	@GetMapping("/findByiD/{eid}")
	public ResponseBean findById(@PathVariable("eid") Integer eid) {

		ResponseBean responseBean = null;

		try {
			responseBean =  new ResponseBean(320, employeeService.findById(eid));
		} catch (EmptyResultDataAccessException e) {
			responseBean = new ResponseBean(404 , "Record not found ");
		} catch (Exception e) {
			responseBean = new ResponseBean(500 ,"Unkown Error");
		}
		return responseBean;
	}

	@GetMapping("/findByNaMe/{ename}")
	public ResponseBean findByName(@PathVariable("ename") String ename) {

		return new ResponseBean(320, employeeService.findByName(ename));
	}

	@DeleteMapping("/deletE/{eid}")
	public String deleteEmp(@PathVariable("eid") Integer eid) {

		employeeService.delete(eid);

		return "Record with id : " + eid + " deleted successfully";

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
