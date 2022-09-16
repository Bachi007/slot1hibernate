package com.slot1hibernate;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Hello world!
 *
 */
public class App 
{
	Configuration conf=null;
    public static void main( String[] args )
    {
    	Scanner bs=new Scanner(System.in);
    	App ap=new App();
    	employee e1=new employee();
    	
    	System.out.print("Select Operation : 1. Registeration 2. Login");
    	int op=bs.nextInt();
    	
    	switch(op)
    	{
    	case 1->{
    		System.out.print("Enter Employee Id");
        	int eId=bs.nextInt();
        	System.out.print("Enter Employee Name");
        	String eName=bs.next();
        	System.out.print("Enter Employee password");
        	String ePwd=bs.next();
        	System.out.print("Enter Employee domain");
        	String edomain=bs.next();
        	System.out.print("Enter Employee Salary");
        	int esal=bs.nextInt();
        	e1.setEmpId(eId);
        	e1.setEmpName(eName);
        	e1.setEmpPassword(ePwd);
            e1.setEmpDomain(edomain);
            e1.setEmpSalary(esal);
            ap.connect();
            ap.register(e1);
    	}
    	case 2->{
    		System.out.println("Enter username");
    		String uname=bs.next();
    		System.out.println("Enter Password");
    		String pwd=bs.next();
    		ap.connect();
    		int res=ap.login(uname, pwd);
    		if(res==0) {
    			System.out.println("Error:User not found");
    		}
    		else if (res==-1) {
    			System.out.println("Error:Username or Password is wrong");
    		}
    		else {
    			System.out.println("Login success");
    			System.out.println("Select operation: 1 for change Domain 2 for change Password 3 for Delete Account");
    			int op2=bs.nextInt();
    			switch(op2) {
    			
    			case 1->{
    				System.out.println("Enter new Domain");
    				String newdomain=bs.next();
    				ap.changeDomain(newdomain, res);
    			}
    			case 3->{
    				System.out.println("Are you sure you want delete(Yes/No)");
    				String del=bs.next();
    				if(del.equals("Yes")) {
    					ap.deleteAccount(res);
    				}
    			}
    			
    			}
    			
    			
    		}
    		
    	}
    	
    	}
    	
    
    }
    
    public void connect() {
    	conf=new Configuration().configure().addAnnotatedClass(employee.class);
    }
    
    public void register(employee e1) {
    	SessionFactory sf=conf.buildSessionFactory();
    	Session ses=sf.openSession();
    	Transaction tx=ses.beginTransaction();
    	ses.save(e1);
    	System.out.println(e1);
    	tx.commit();
    }
    
    public int login(String username,String password) {
    	
    	SessionFactory sf=conf.buildSessionFactory();
    	Session ses=sf.openSession();
    	Transaction tx=ses.beginTransaction();
    	employee e2=null;
    	e2=(employee)ses.createQuery("from employee e where e.empName=:username").setParameter("username", username).uniqueResult();
    	if(e2==null)
    	{
    			return 0;
    	}
    	else {
    		if(password.equals(e2.getEmpPassword())) {
    			return e2.getEmpId();
    		}
    		else {
    			return -1;
    		}
    	}
    }
    
    public void changeDomain(String newdomain,int eid) {
    	
    	SessionFactory sf=conf.buildSessionFactory();
    	Session ses=sf.openSession();
    	Transaction tx=ses.beginTransaction();
    	Query qu=ses.createQuery("update employee set empDomain=:newDomain where empId=:eId");
    	qu.setParameter("newDomain", newdomain);
    	qu.setParameter("eId", eid);
    	
    	int status=qu.executeUpdate();
    	System.out.println(status);
    	
    }
    
    public void deleteAccount(int eid) {
    	SessionFactory sf=conf.buildSessionFactory();
    	Session ses=sf.openSession();
    	Transaction tx=ses.beginTransaction();
    	Query qu=ses.createQuery("delete from employee where empId=:eid").setParameter("eid", eid);
    	
    	int st=qu.executeUpdate();
    			System.out.println(st+" employee deleted");
    	
    }
    
}
