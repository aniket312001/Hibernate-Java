package com.hibernate.hib;

import java.util.List;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator; 
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
    
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        
        System.out.println(factory);
        
        System.out.println(factory.isClosed());
    
//         creating Student
        Student s1 = new Student("sam",66);
//        System.out.println(s1);
        
        
//        creating Object of Address
        Address ad = new Address();
        ad.setStreet("bopodi");
        ad.setCity("pune");
        ad.setOpen(true);
        ad.setX(2.23);
        ad.setAddDate(new Date());
        
        // Image Reading 
        FileInputStream file = new FileInputStream("src/main/java/pic.jpg");
        byte[] data = new byte[file.available()];
        file.read(data);
        
        ad.setImage(data);
        
        
        //Session session = factory.getCurrentSession();
        Session session = factory.getSessionFactory().openSession();
        
        Transaction tx = session.beginTransaction();
        session.save(s1);
        
//        s1 = session.get(Student.class, 2);
//        System.out.println(s1);
//        
//        
//        String SQL_QUERY ="from Student students";  
//        Query query = session.createQuery(SQL_QUERY);  
//        Iterator it=query.iterate();  
//        while(it.hasNext())  
//        {  
//        Student e=(Student)it.next();  
//        System.out.println(e);
//        }
        
        // Address
//        session.save(ad);
        
        
        tx.commit();
        
        session.close();
    }
}
