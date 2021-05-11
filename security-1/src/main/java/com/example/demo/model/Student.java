package com.example.demo.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="studentinfo")
public class Student {
	@Id
	private int sno;
	private String sname;
	private int sage;
	public Student() {
		System.out.println("default constructor");
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", sage=" + sage + "]";
	}
	

}
