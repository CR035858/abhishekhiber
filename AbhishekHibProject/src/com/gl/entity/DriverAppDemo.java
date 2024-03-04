package com.gl.entity;

import java.util.List;
import javax.persistence.Entity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@Entity
public class DriverAppDemo {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		
		
		/*	Session session=null;
		session=factory.openSession();
		Transaction tx=session.beginTransaction();
		//System.out.println(tx);
		
		Employee e1=new Employee(102,"Ben",900);
		session.save(e1);
		
		Employee e2=new Employee();
		e2.setEno(103);
		e2.setName("Chris");
		e2.setSal(1000);
		session.save(e2);
		tx.commit();
		session.close();*/
		
			Session session1=null;
		session1=factory.openSession();
		System.out.println(session1);
		Transaction tx1=session1.beginTransaction();
		Employee e3=new Employee();
		e3=session1.get(Employee.class,02);
		
		
		//session1.save(e3);
		
		System.out.println("employee "+session1.get(Employee.class, 1));tx1.commit();
		
		session1=factory.openSession();
		tx1=session1.beginTransaction();
		List<Employee> emp=session1.createQuery("from Employee").list();
		for(Employee employee:emp )
			System.out.println(employee);
		tx1.commit();
		session1.close();
		factory.close();
		

	}

}
