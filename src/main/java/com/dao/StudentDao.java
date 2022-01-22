package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class StudentDao {

	SessionFactory factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();

	public List<Student> liststudents() {

		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Student> students = session.createQuery("from student").list();
		// session.getTransaction().commit();
		return students;
	}

}
