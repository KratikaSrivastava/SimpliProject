package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name = "teacher")
@Table(name = "teacher")

public class Teacher {


		@Id
		@Column(name = "teacher_id")
		private int id;

		@Column(name = "teacher_name")
		private String name;

		@Column(name = "teacher_age")
		private int age;
	
		@Column(name = "teacher_salary")
		private int salary;

		public Teacher() {

		}
		
		
		public Teacher(int id, String name, int age, int salary) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.salary = salary;
		}


		public int getId() {
			return id;
		}

		
		public void setId(int id) {
			this.id = id;
		}

		
		public String getName() {
			return name;
		}

		
		public void setName(String name) {
			this.name = name;
		}

		
		public int getAge() {
			return age;
		}

		
		public void setAge(int age) {
			this.age = age;
		}

		
		public int getSalary() {
			return salary;
		}

		
		public void setSalary(int salary) {
			this.salary = salary;
		}


		@Override
		public String toString() {
			return "Teacher [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
		}
		
		
}
