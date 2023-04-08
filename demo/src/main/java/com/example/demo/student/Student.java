package com.example.demo.student;
import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

import java.time.*;
@Entity
@Table
public class Student {
	@Id
	@SequenceGenerator(
			name="student_sequnce",
			sequenceName="student_sequnce",
			allocationSize=1
			)
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE,
			generator="student_sequence"
			)
	private long id;
	private String name;
	private String email;
	private LocalDate dob;
	@Transient
	private Integer age;
	
	public Student() {
	}
	public Student(Long id, String name,String email,LocalDate dob){
		this.id=id;
		this.name=name;
		this.email=email;
		this.dob=dob;
	}
	public Student(String name,String email,LocalDate dob) {
		this.name=name;
		this.email=email;
		this.dob=dob;
	}
	public Integer getAge() {
		return Period.between(this.dob,LocalDate.now()).getYears();
	}
	public LocalDate getDob() {
		return dob;
	}
	public String getEmail() {
		return email;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	} 
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}

