package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

 

@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
private int sid;
private String firstName;
private String lastName;
private String semail;
private String spassword;

 


public Student(int sid, String firstName, String lastName, String semail, String spassword) {
    super();
    this.sid = sid;
    this.firstName = firstName;
    this.lastName = lastName;
    this.semail = semail;
    this.spassword = spassword;
}
public int getSid() {
    return sid;
}
public void setSid(int sid) {
    this.sid = sid;
}

 

public String getFirstName() {
    return firstName;
}
public void setFirstName(String firstName) {
    this.firstName = firstName;
}
public String getLastName() {
    return lastName;
}
public void setLastName(String lastName) {
    this.lastName = lastName;
}
public String getSemail() {
    return semail;
}
public void setSemail(String semail) {
    this.semail = semail;
}
public String getSpassword() {
    return spassword;
}
public void setSpassword(String spassword) {
    this.spassword = spassword;
}

}