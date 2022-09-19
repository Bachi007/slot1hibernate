package com.slot1hibernate;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class college {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration conf=new Configuration().configure().addAnnotatedClass(student.class).addAnnotatedClass(bike.class);
		
		SessionFactory sf=conf.buildSessionFactory();
		Session ses=sf.openSession();
		
		Transaction tc=ses.beginTransaction();
		
		
//		student s1=new student();
//		s1.setStId(101);
//		s1.setStName("ketan");
//		s1.setStGroup("BCA");
//		
//		bike b1=new bike();
//		b1.setBikeId(1);
//		b1.setBikeName("Pulsar rs 200");
//		s1.setStBike(b1);
//		
//		student s2=new student();
//		s2.setStId(102);
//		s2.setStName("Rahul");
//		s2.setStGroup("PHD");
//		
//		bike b2=new bike();
//		b2.setBikeId(2);
//		b2.setBikeName("KTM Adv 390");
//		
//		s2.setStBike(b2);
//		
//		ses.save(b2);
//		ses.save(b1);
//		ses.save(s1);
//		ses.save(s2);
//		
//		System.out.println("Inserted successfully");
		
		
		Query qu=ses.createQuery("from student");
		
		List<student> sl=qu.getResultList();
		for(student s:sl)
		System.out.println(s.getStName()+" has "+s.getStBike().getBikeName());
		
		tc.commit();
	}

}
