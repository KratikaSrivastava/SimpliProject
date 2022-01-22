package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="assignt")
@Table(name="assignt")
public class assignt {

	@Id
	@Column(name="tid")
	private int id;
	
	@Column(name="tname")
	private String name;
	
	@Column(name="cname")
	private String c_name;
	
	public assignt() {
		
	}

	public assignt(int id, String name, String c_name) {
		super();
		this.id = id;
		this.name = name;
		this.c_name = c_name;
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

	
	public String getC_name() {
		return c_name;
	}

	
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	@Override
	public String toString() {
		return "assignt [id=" + id + ", name=" + name + ", c_name=" + c_name + "]";
	}
	
	
}
