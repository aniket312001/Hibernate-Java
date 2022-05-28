package com.hibernate.HQL;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.hib.Student;

public class HQLExample {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        
        String query = "from Student where marks=66 ";
        
        Query q = session.createQuery(query);
        List<Student> lt =  q.list();
        System.out.println(lt);
        
        for(Student s:lt) {
        	System.out.println(s.getName());
        }
         
        String qu2 = "delete from Student where name = :x";
        Query q2 = session.createQuery(qu2);
        q2.setParameter("x","lola");
        q2.executeUpdate();
        
        tx.commit();        
        session.close();
		factory.close();
	}
}
