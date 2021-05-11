package com.example.demo.dao;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Admin;

 



 

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer>{

 

}
