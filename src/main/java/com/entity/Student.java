package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "student")
@Table(name = "student")
public class Student {

	@Id
	@Column(name = "std_id")
	private int rollno;

	@Column(name = "std_name")
	private String name;

	@Column(name = "std_age")
	private String age;

	public Student() {

	}

	public Student(int rollno, String name, String age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
	
	

}
