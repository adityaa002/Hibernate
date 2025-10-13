package com.rays.sql;

import java.util.Iterator;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestSQLColumn {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		SQLQuery q = session.createSQLQuery("select ID, FIRSTNAME from UserDto");

		List list = q.list();

		Iterator it = list.iterator();

		while (it.hasNext()) {
			Object[] obj = (Object[]) it.next();

			System.out.print(obj[0]);
			System.out.println("\t" + obj[1]);

		}
		session.close();
	}
}
