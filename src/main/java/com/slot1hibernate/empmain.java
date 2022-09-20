package com.slot1hibernate;
//manytoone
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class empmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration conf=new Configuration().configure().addAnnotatedClass(employee.class).addAnnotatedClass(address.class);
    	
    	SessionFactory sf=conf.buildSessionFactory();
    
    	Session  ses=sf.openSession();
    	
    	Transaction tx=ses.beginTransaction();
    	
//    	employee e1=new employee();
//    	e1.setEmpId(101);
//    	e1.setEmpName("Gunjan");
//    	e1.setEmpRole("Java Developer");
//    	
//    	employee e2=new employee();
//    	e2.setEmpId(102);
//    	e2.setEmpName("Rupa");
//    	e2.setEmpRole("Full Stack");
//    	
//    	employee e3=new employee();
//    	e3.setEmpId(103);
//    	e3.setEmpName("Shikha");
//    	e3.setEmpRole("Front End Dev");
//    	
//    	address ad1=new address();
//    	ad1.setAdId(1);
//    	ad1.setAdCity("Noida");
//    	ad1.setAdPincode(121002);
//    	
//    	e1.setEmpaddress(ad1);
//    	e2.setEmpaddress(ad1);
//    	e3.setEmpaddress(ad1);
//    	
//    	ses.save(e3);
//    	ses.save(e2);
//    	ses.save(e1);
//    	ses.save(ad1);
    	
    	Query qu=ses.createQuery("from employee");
    	List<employee> el=qu.getResultList();		
    	
    	for(employee e:el)
    	System.out.println(e.getEmpName()+" from "+e.getEmpaddress().getAdCity());
    	
    	
    	
    	
    	tx.commit();
    	ses.close();
    	
	}

}
