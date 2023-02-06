package com.global;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.global.payment.Payment;
import com.global.types.Card;
import com.global.types.Cheque;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg= new Configuration();
    	cfg.configure("resources/hibernate.cfg.xml");
    	SessionFactory s= cfg.buildSessionFactory();
    	Session session=s.openSession();
    	session.beginTransaction();
    	     
    	Payment pay=new Payment();
    	pay.setAmount(19800);
    	         
    	Card card= new Card();
    	card.setCardno(540213);
    	card.setCardType("MASTER");
    	card.setAmount(8956);
    	        
    	Cheque cheque= new Cheque();
    	cheque.setChequeno(45630);
    	cheque.setChequeType("ORDER");
    	cheque.setAmount(13654);
    	        
    	session.save(pay);
    	session.save(card);
    	session.save(cheque);
    	                                 
    	session.getTransaction().commit();
    	System.out.println("Successfull!!");       }
}
