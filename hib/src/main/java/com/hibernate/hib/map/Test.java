package com.hibernate.hib.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] arg) {
		Question q = new Question();
		
		q.setQuestion("what is python");
		
		Answer a = new Answer();
		a.setAnswer("programming language for MI AI");
		a.setQuestion(q);
		
		
		Answer a1 = new Answer();
		a1.setAnswer("can create game");
		a1.setQuestion(q);
		

		Answer a2 = new Answer();
		a2.setAnswer("can create website with django and flask");
		a2.setQuestion(q);
		
		//q.setAnswer(a);
		
		List<Answer> lst = new ArrayList<Answer>();
		lst.add(a);
		lst.add(a1);
		lst.add(a2);
		
		q.setAnswer(lst);
		
		 SessionFactory factory = new Configuration().configure().buildSessionFactory();
		 
		 Session session = factory.getSessionFactory().openSession();
	        
	        Transaction tx = session.beginTransaction();
//	        session.save(q);
//	        session.save(a);
//	        session.save(a2);
//	        session.save(a1);

	        Question qu =(Question) session.get(Question.class,1);
	        System.out.println(qu.getQuestion());
	        
	        for (Answer am : qu.getAnswer()) {
	        	System.out.println(am.getAnswer());
	        }
	        
	        
	        
	        
	        
	        tx.commit();
	        
	     session.close();
		 
		 factory.close();
	}
}
