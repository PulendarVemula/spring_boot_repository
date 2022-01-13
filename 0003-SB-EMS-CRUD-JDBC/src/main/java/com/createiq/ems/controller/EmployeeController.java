package com.createiq.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.createiq.ems.model.Employee;
import com.createiq.ems.service.EmployeeService;

@Controller("empController")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	
	@RequestMapping("/")
	public ModelAndView welcome() {
		
		return new ModelAndView("welcome");
	}
	@RequestMapping("/addEmployee")
	public ModelAndView addEmployee() {

		return new ModelAndView("addEmployee");

	}

	@RequestMapping("/allEmployees")
	public ModelAndView allEmployees() {

		List<Employee> employees = employeeService.findAll();

		return new ModelAndView("allEmployees", "employees", employees);

	}

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public ModelAndView saveEmployee(Employee employee) {

		employeeService.add(employee);

		return new ModelAndView("redirect:/allEmployees");

	}

	@RequestMapping("/deleteEmployee")
	public ModelAndView deleteEmployee(@RequestParam("eid") Integer eid) {

		employeeService.deleteById(eid);

		return new ModelAndView("redirect:/allEmployees");

	}

	@RequestMapping("/showUpdateEmployee")
	public ModelAndView showUpdateEmployee(@RequestParam("eid") Integer eid) {

		Employee employee = employeeService.findById(eid);

		return new ModelAndView("updateEmployee", "employee", employee);

	}
	
	@RequestMapping(value = "/updateEmployee" , method = RequestMethod.POST)
	
	public ModelAndView updateEmployee(Employee employee) {
		
		employeeService.update(employee);
		
		return new ModelAndView("redirect:/allEmployees");
		
	}

}
