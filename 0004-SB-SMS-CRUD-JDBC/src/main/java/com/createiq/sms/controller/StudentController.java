package com.createiq.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.createiq.sms.model.Student;
import com.createiq.sms.service.StudentService;

@Controller("empController")
public class StudentController {

	@Autowired
	private StudentService studentService ;
	
	@RequestMapping("/")
	public ModelAndView welcome() {
		return new ModelAndView("welcome");
		
	}
	@RequestMapping("/addStudent")
	public ModelAndView addStudent() {
		
		return new ModelAndView("addStudent");
		
	}
	
	@RequestMapping("/saveStudent")
	public ModelAndView saveStudent(Student student) {
		
		studentService.add(student);
		
		return new ModelAndView("redirect:/allStudents");
	}
	
	@RequestMapping("/allStudents")
	public ModelAndView allStudents() {
		
		List<Student> students = studentService.findAll();
		
		return new ModelAndView("allStudents" , "allStd" , students);
		
	}
	
	@RequestMapping("/showUpdateStudent")
	public ModelAndView showUpdateStudent(@RequestParam("sid") Integer sid) {
		
		Student student = studentService.findById(sid);
		
		return new ModelAndView("updateStudent" , "student" , student);
	}
	
	@RequestMapping(value = "/updateStudent" , method = RequestMethod.POST)
	public ModelAndView updateStudent(Student student) {
		
		studentService.update(student);
		return new ModelAndView("redirect:/allStudents");
		
	}
	@RequestMapping("/deleteStudent")
	public ModelAndView deleteStudent(@RequestParam("sid") Integer sid) {
		
		studentService.deleteById(sid);
		
		return new ModelAndView("redirect:/allStudents");
		
	}
	
}
