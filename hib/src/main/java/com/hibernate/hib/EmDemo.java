package com.hibernate.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SessionFactory factory = new Configuration().configure().buildSessionFactory();
	        
		 Student st = new Student();
		 st.setName("pio");
		 st.setMarks(35);
		 
		 Certificate c = new Certificate();
		 c.setCourse("java");
		 c.setDuration("33hr");
		 
		 st.setCertif(c);
		 
		  Session session = factory.getSessionFactory().openSession();
	        
	        Transaction tx = session.beginTransaction();
	        session.save(st);
	        tx.commit();
	        
	     session.close();
		 
		 factory.close();
	}

}
