package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
