package com.slot1hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class empcachemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Configuration conf=new Configuration().configure().addAnnotatedClass(emp.class);
    	
    	SessionFactory sf=conf.buildSessionFactory();
    
    	Session  ses=sf.openSession();
    	
    	ses.beginTransaction();
	
    	emp e1=(emp)ses.get(emp.class, 1);

    	ses.getTransaction().commit();
    	
    	Session  ses2=sf.openSession();

		emp e2=(emp)ses2.get(emp.class, 1);
    	ses2.getTransaction().commit();
	}

}
