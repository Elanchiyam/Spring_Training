package com.global;

import java.util.List;
import java.util.Scanner;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.global.model.Employee;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//    	Configuration configuration = new Configuration();
//    	configuration.configure("resources/hibenate.cfg.xml");
//    	SessionFactory sessionFactory = configuration.buildSessionFactory();
//    	Session session = sessionFactory.openSession();
//    	Transaction transaction = session.beginTransaction();
//    	Employee employee = new Employee();
//    	Scanner scanner = new Scanner(System.in);
//    	System.out.println("Enter Employee Id");
//    	employee.setId(scanner.nextInt());
//    	System.out.println("Enter Employee name");
//    	employee.setName(scanner.next());
//    	System.out.println("Enter Employee salary");
//    	employee.setSalary(scanner.nextFloat());
//    	
//    	session.save(employee);
//    	transaction.commit();
//    	System.out.println("Employee object is persisted");
    	
    	Configuration configuration = new Configuration();
    	configuration.configure("resources/hibenate.cfg.xml");
    	SessionFactory sessionFactory = configuration.buildSessionFactory();
    	Session session = sessionFactory.openSession();

    	
    	Query createQuery = session.createQuery("insert into Employee(id,name,salary) values(105,'Ram',80000.0)");
    	Query updateQuery = session.createQuery("update Employee set id=3 where name ='Siva'");

    	
    	Transaction transaction = session.beginTransaction();
    	int result1 = createQuery.executeUpdate();
    	System.out.println(result1 + " is inserted");
    	
    	int result2 = updateQuery.executeUpdate();
    	System.out.println(result2 + " is updated");
    	
    	org.hibernate.query.Query  selectQuery = session.createQuery("from Employee");
    	List<Employee> list = selectQuery.getResultList();
    	for(Employee emp: list) {
    		System.out.println(emp.getId()
    				+ " " + emp.getName()
    				+ " " + emp.getSalary());
    	}
    	

    	transaction.commit();


    }
}
