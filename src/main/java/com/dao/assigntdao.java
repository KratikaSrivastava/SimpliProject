package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.assignt;

public class assigntdao {

	SessionFactory factory = new Configuration().configure().addAnnotatedClass(assignt.class).buildSessionFactory();

	public void subjectclass(assignt cs) {

		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(cs);
		session.getTransaction().commit();
		System.out.println("insert successfully");
	}
}
