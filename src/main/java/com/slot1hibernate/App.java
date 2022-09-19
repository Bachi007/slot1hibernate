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
	
    public static void main( String[] args )
    {
    	Configuration conf=new Configuration().configure().addAnnotatedClass(teamindia.class).addAnnotatedClass(batsman.class).addAnnotatedClass(bowler.class);
    	
    	SessionFactory sf=conf.buildSessionFactory();
    
    	Session  ses=sf.openSession();
    	
    	Transaction tx=ses.beginTransaction();
    	
//    	teamindia t1=new teamindia();  	
//    	t1.setFirstName("bachi");
//    	t1.setLastName("Ch");
//    	
//    	batsman b1=new batsman();
//    	b1.setFirstName("M S");
//    	b1.setLastName("Dhoni");
//    	b1.setBattingHand("Right");
//    	b1.setHighestScore(183);
//    	
//    	batsman b2=new batsman();
//    	b2.setFirstName("Virat");
//    	b2.setLastName("Kohli");
//    	b2.setBattingHand("Right");
//    	b2.setHighestScore(183);
//    	
//    	batsman b3=new batsman();
//    	b3.setFirstName("Rohit");
//    	b3.setLastName("Sharma");
//    	b3.setBattingHand("Right");
//    	b3.setHighestScore(246);
//    	
//    	bowler bl1=new bowler();
//    	bl1.setFirstName("Zaheer");
//    	bl1.setLastName("Khan");
//    	bl1.setBowlingHand("Left");
//    	bl1.setBestfigure("8/25");
//    	
//    	bowler bl2=new bowler();
//    	bl2.setFirstName("Asish");
//    	bl2.setLastName("Nehra");
//    	bl2.setBowlingHand("Left");
//    	bl2.setBestfigure("7/35");
//    	
//    	bowler bl3=new bowler();
//    	bl3.setFirstName("Jaspirt");
//    	bl3.setLastName("Bhumra");
//    	bl3.setBowlingHand("Right");
//    	bl3.setBestfigure("6/22");
//    	
//    	ses.save(bl3);
//    	ses.save(bl2);
//    	ses.save(bl1);
//    	ses.save(b3);
//    	ses.save(b2);
//    	ses.save(b1);
//    	ses.save(t1);
//    	System.out.println("Inserted successfully");

    	Query qu=ses.createQuery("from batsman");
    	
    	List<batsman> bl=qu.getResultList();
    	System.out.println("Batsman list");
    	for(batsman batter:bl)
    	System.out.println(batter.getFirstName()+" "+batter.getLastName()+" "+batter);
    	
    	Query qu2=ses.createQuery("from bowler");
    	
    	List<bowler> bow=qu2.getResultList();
    	System.out.println("Bowler list");
    	for(bowler batter:bow)
    	System.out.println(batter.getFirstName()+" "+batter.getLastName()+" - "+batter.getBestfigure());
    	
    	
    	
    	
    	
    	tx.commit();
    }
    }
