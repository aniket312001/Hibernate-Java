package com.hibernate.hib.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.hib.map.Answer;
import com.hibernate.hib.map.Question;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Project p1 = new Project();
		p1.setPname("HRMS");
		
		Project p2 = new Project();
		p2.setPname("website");
		
		Emp e1 = new Emp();
		e1.setEname("Aniket");
		
		
		Emp e2 = new Emp();
		e2.setEname("sam");
		
		
		Emp e3 = new Emp();
		e3.setEname("jon");
		
		
		
		List<Project> plist = new ArrayList<Project>();
		plist.add(p1);
		plist.add(p2);
		
		List<Emp> elist = new ArrayList<Emp>();
		elist.add(e1);
		
		
		p1.setEmps(elist);
		elist.add(e3);
		elist.add(e2);
		p2.setEmps(elist);
		
		e1.setProjects(plist);
		e2.setProjects(plist);
		
		
		
		Project p3 = new Project();
		p1.setPname("App");
		p1.setEmps(elist);
		
		plist.add(p3);
		
		e3.setProjects(plist);
		
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		 
		Session session = factory.getSessionFactory().openSession();
	        
	        Transaction tx = session.beginTransaction();
//	      
	        session.save(p1);
	        session.save(p2);
	        session.save(p3);
	        
	        session.save(e1);
	        session.save(e2);
	        session.save(e3);
	        
	        
	        
	        
	        tx.commit();
	        
	     session.close();
		 
		 factory.close();
	}

}
