package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name = "subject")
@Table(name = "subject")
public class Subject {


	@Id
	@Column(name = "subject_id")
	private int id;
	
	@Column(name = "subject_name")
	private String name;

	public Subject() {
		
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

	public Subject(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + "]";
	}
	
	

}


