package com.hibernate.hib.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String pname;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Emp> emps;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", emps=" + emps + "]";
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public List<Emp> getEmps() {
		return emps;
	}
	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}
	
	
}
