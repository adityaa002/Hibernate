package com.rays.hql;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class TestHQLCount {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		Query q = session.createQuery("select count(*) from UserDTO");

		List list = q.list();

		Iterator it = list.iterator();

		while (it.hasNext()) {
			Object obj = (Object) it.next();

			System.out.println(obj);
			 
		}

		tx.commit();
		session.close();

	}

}
