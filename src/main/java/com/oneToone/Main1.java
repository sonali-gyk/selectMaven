package com.oneToone;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.select.Select;

public class Main1 {

	public static void main(String... a) {
		System.out.println("1");
		Configuration cfg = new Configuration();
		System.out.println("2");
		cfg.configure("h1.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Customer cust=new Customer();
		cust.setMobileNo("1234567890");
		cust.setName("ramcharn");
		
		Transaction1 transaction=new Transaction1();
		transaction.setDate(null);
		transaction.setTotal(12345);
		cust.setTransaction(transaction);
		session.save(cust);
		session.getTransaction().commit();
		session.close();
		sf.close();
		System.out.println("selected succesfully................");
	}
}
