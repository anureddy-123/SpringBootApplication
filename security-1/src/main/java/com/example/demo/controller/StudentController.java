package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/apply")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/create")
	public Student create(@RequestBody Student stu) {
		return studentService.create(stu);
	}
	
	@GetMapping("/getallstudents")
	public Iterable<Student> getStudents(){
		return studentService.getAllstudents();
	}
	

}
