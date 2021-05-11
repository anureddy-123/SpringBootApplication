package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;

@Service
public class StudentService {
	@Autowired
	private StudentDao studentDao;
	
	
	public Student create(Student stu) {
		return studentDao.save(stu);
	}
	public Iterable<Student> getAllstudents(){
		return studentDao.findAll();
	}
		
	}


