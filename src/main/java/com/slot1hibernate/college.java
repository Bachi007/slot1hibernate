package com.slot1hibernate;
//onetomany
import java.util.ArrayList;
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
		
//		bike b1=new bike();
//		b1.setBikeId(1);
//		b1.setBikeName("Honda african twin");
//		
//		bike b2=new bike();
//		b2.setBikeId(2);
//		b2.setBikeName("Ducati Multistarda");
//		
//		student s1=new student();
//		s1.setStId(121);
//		s1.setStName("Sandeep");
//		s1.setStGroup("BCA");
//		
//		List<bike> ll=new ArrayList<bike>();
//		ll.add(b2);
//		ll.add(b1);
//		
//		s1.setStBike(ll);
//		
//		ses.save(s1);
//		ses.save(b1);
//		ses.save(b2);
//		
		Query qu=ses.createQuery("from student");
		List<student> sl=qu.getResultList();
		
		for(student s:sl)
		{
		System.out.print(s.getStName()+" "+s.getStGroup());
		List<bike> bl=s.getStBike();
			for(bike b:bl)
				System.out.print(b.getBikeName());
		
		
		}
		tc.commit();
	}

}
