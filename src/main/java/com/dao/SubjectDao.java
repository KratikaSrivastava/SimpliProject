package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Student;
import com.entity.Subject;

public class SubjectDao {

	SessionFactory factory = new Configuration().configure().addAnnotatedClass(Subject.class).buildSessionFactory();

	public List<Subject> listsubject() {

		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Subject> students = session.createQuery("from subject").list();
		// session.getTransaction().commit();
		return students;
	}

}
