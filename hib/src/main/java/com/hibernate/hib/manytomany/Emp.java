package com.hibernate.hib.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Emp {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String ename;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Project> projects;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", projects=" + projects + "]";
	}
	
	
	
}
