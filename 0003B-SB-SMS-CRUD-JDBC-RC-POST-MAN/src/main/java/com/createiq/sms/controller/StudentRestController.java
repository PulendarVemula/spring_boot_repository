package com.createiq.sms.controller;

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

import com.createiq.sms.model.Student;
import com.createiq.sms.service.StudentService;

@RestController
@RequestMapping("/StuDent")
public class StudentRestController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/allStudents")
	public List<Student> allStudents() {
		
		return studentService.findAll();
		
	}
	@GetMapping("/findByiD/{sid}")
	public Student findByid(@PathVariable("sid") Integer sid) {
		
		return studentService.findById(sid);
		
	}
	@GetMapping("findByNaMe/{sname}")
	public List<Student> findByName(@PathVariable("sname") String sname) {
		
		return studentService.findByName(sname);
		
	}
	@DeleteMapping("/delete/{sid}")
	public String deleteStudent(@PathVariable("sid") Integer sid) {
		
		studentService.deleteById(sid);
		
		return "Record with sid : "+sid+" deleted successfully";
		
	}
	@PostMapping("/addStudent")
	public String addStudent(@RequestBody Student student) {
		
		studentService.add(student);
		
		return "Record inserted successfully";
		
	}
	@PutMapping("/updateStudent")
	public String updateStudent(@RequestBody Student student) {
		
		studentService.update(student);
		
		return "Student record successfully updated";
		
	}
}
