package com.slot1hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration conf=new Configuration().configure().addAnnotatedClass(developer.class).addAnnotatedClass(laptop.class);
    	
    	SessionFactory sf=conf.buildSessionFactory();
    
    	Session  ses=sf.openSession();
    	
    	Transaction tx=ses.beginTransaction();
		
//		developer d1=new developer();
//		d1.setDevId(123);
//		d1.setDevName("Suraj");
//		d1.setDevProject("IKEA");
//		
//		developer d2=new developer();
//     	d2.setDevId(124);
//		d2.setDevName("Prashant");
//		d2.setDevProject("HSBC");
//		
//		laptop l1=new laptop();
//		l1.setLapId(1);
//		l1.setLapName("Asus Tuf gaming");
//		
//		laptop l2=new laptop();
//		l2.setLapId(2);
//		l2.setLapName("Acer Predator");
//		
//		List<laptop> ll=new ArrayList<laptop>();
//		ll.add(l2);
//		ll.add(l1);
//		
//		d1.setDevLap(ll);
//		List<laptop> ll2=new ArrayList<laptop>();
//		ll2.add(l2);
//		d2.setDevLap(ll2);
//		
//		ses.save(l2);
//		ses.save(l1);
//		ses.save(d2);
//		ses.save(d1);


    	Query qu=ses.createQuery("from developer");
    	List<developer> dl=qu.getResultList();
    	for(developer dev:dl)
    	{
    		System.out.print(dev.getDevName()+" working with ");
    		List<laptop> ll=dev.getDevLap();
    		for(laptop l:ll)
    		System.out.print(" "+l.getLapName());
    		System.out.println("");
    	}
    	
		tx.commit();
		
		
		
		
	}

}
