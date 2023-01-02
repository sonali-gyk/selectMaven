package com.select;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelectMain {

	public static void main(String... a) {
		System.out.println("1");
		Configuration cfg = new Configuration();
		System.out.println("2");
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		Query query = session.createQuery("from Select");
		List<Select> std = query.list();
		for (Select ss : std) {
			System.out.println("Id= " + ss.getId() + " city= " + ss.getEmpCity());
		}
		session.getTransaction().commit();
		session.close();
		sf.close();
		System.out.println("selected succesfully................");
	}
}
