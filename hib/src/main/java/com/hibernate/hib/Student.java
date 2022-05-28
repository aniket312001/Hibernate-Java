package com.hibernate.hib;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String name;
	private int marks;
	private Certificate certif;
	
	
	public Certificate getCertif() {
		return certif;
	}

	public void setCertif(Certificate certif) {
		this.certif = certif;
	}

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
		
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
}
