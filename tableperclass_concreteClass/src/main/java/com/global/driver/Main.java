package com.global.driver;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.global.model.Employee;
import com.global.model.PermanentEmployee;
import com.global.util.HibernateUtil;


public class Main {
	public static void main(String[] args) {
		//Get session factory using Hibernate Util class
		SessionFactory sf = HibernateUtil.getSessionFactory();
		//Get session from Sesson factory
		Session session = sf.openSession();
		
		//Begin transaction
		Transaction t=session.beginTransaction();  

		//Creating Employee base class record
		Employee employee=new Employee();  
		employee.setName("John");
		employee.setCity("Newyork");
	    
		//Creating Permanent Employee subclass record
	    PermanentEmployee permanentEmployee=new PermanentEmployee();  
	    permanentEmployee.setName("Jacob");  
	    permanentEmployee.setCity("Delhi");
	    permanentEmployee.setSalary(30000); 
	    t.commit();
	    System.out.println("success");
	}

}
