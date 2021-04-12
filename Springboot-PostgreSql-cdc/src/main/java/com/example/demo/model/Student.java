package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "full_name", nullable = false)
	private String fullName;
	@Column(name = "roll_no", nullable = false)
	private String rollNo;
	public Student() {
	}
	public Student(long id, String fullName, String rollNo) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", fullName=" + fullName + ", rollNo=" + rollNo + "]";
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	
	
}
