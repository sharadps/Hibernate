package com.app.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.model.Student;

public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure();

		SessionFactory sf = cfg.buildSessionFactory();
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();

		/*
		 * Student s = new Student(); s.setStudId(12); s.setStdName("kapil");
		 * s.setDt1(new Date()); s.setDt2(new Date()); s.setDt3(new Date());
		 * 
		 * ses.save(s);
		 */
		// get method called
		/*
		 * Student sp = (Student) ses.get(Student.class, 11); System.out.println(sp);
		 */

		Student sp = (Student) ses.load(Student.class, 12);
		System.out.println(sp);

		tx.commit();
		ses.close();

	}
}
