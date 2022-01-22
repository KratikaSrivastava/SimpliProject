package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.ClassDetails;
import com.entity.Teacher;

public class TeacherDao {

	SessionFactory factory = new Configuration().configure().addAnnotatedClass(Teacher.class).buildSessionFactory();

	public List<Teacher> listteacher() {

		Session session = factory.getCurrentSession();
		session.beginTransaction();
		List<Teacher> teacher = session.createQuery("from teacher").list();
		// session.getTransaction().commit();
		return teacher;
	}
}
