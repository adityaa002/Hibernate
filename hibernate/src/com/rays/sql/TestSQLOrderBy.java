package com.rays.sql;

import java.util.Iterator;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestSQLOrderBy {
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		SQLQuery q = session.createSQLQuery("select * from userdto order By firstName");

		List list = q.list();

		Iterator it = list.iterator();

		while (it.hasNext()) {
			Object[] obj = (Object[]) it.next();
			System.out.print( obj[0]);
			System.out.print("\t" + obj[1]);
			System.out.print("\t" + obj[2]);
			System.out.print("\t" + obj[3]);
			System.out.print("\t" + obj[4]);
			System.out.print("\t" + obj[5]);
			System.out.println("\t" + obj[6]);
		}

		tx.commit();
		session.close();

	}
}
