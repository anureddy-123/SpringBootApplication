package com.example.demo.model;

import java.util.List;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

 

@Entity
@Table(name = "admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int aid;
    private String AfirstName;
    private String AlastName;
    private String adminemail;
    private String adminPassword;
    @OneToMany
    private List<Student> student;

 

    public List<Student> getStudent() {
        return student;
    }

 

    public void setStudent(List<Student> student) {
        this.student = student;
    }

 

    public int getAid() {
        return aid;
    }

 

    public void setAid(int aid) {
        this.aid = aid;
    }

 

    
    public String getAfirstName() {
        return AfirstName;
    }

 

    public void setAfirstName(String afirstName) {
        AfirstName = afirstName;
    }

 

    public String getAlastName() {
        return AlastName;
    }

 

    public void setAlastName(String alastName) {
        AlastName = alastName;
    }

 

    public String getAdminemail() {
        return adminemail;
    }

 

    public void setAdminemail(String adminemail) {
        this.adminemail = adminemail;
    }

 

    public String getAdminPassword() {
        return adminPassword;
    }

 

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

 

}
