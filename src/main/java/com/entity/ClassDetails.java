package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "class")
@Table(name = "class")
public class ClassDetails {

	@Column(name = "class_name")
	private String name;

	@Column(name = "class_section")
	private char section;

	@Id
	@Column(name = "class_id")
	private int id;

	public ClassDetails() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSection() {
		return section;
	}

	public void setSection(char section) {
		this.section = section;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ClassDetails(String name, char section, int id) {
		super();
		this.name = name;
		this.section = section;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Class [name=" + name + ", section=" + section + ", id=" + id + "]";
	}
}
