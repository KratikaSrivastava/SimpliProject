package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.ClassDetails;
import com.entity.Student;

public class ClassDao {

	SessionFactory factory = new Configuration().configure().addAnnotatedClass(ClassDetails.class).buildSessionFactory();

	public List<ClassDetails> listclass() {

		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<ClassDetails> classset = session.createQuery("from class").list();
		// session.getTransaction().commit();
		return classset;
	}
}
