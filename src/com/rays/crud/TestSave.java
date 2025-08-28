package com.rays.crud;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.user.UserDTO;

public class TestSave {

	public static void main(String[] args) {
		UserDTO dto = new UserDTO();
		dto.setFirstName("Yusuf");
		dto.setLastName("Khan");
		dto.setLoginId("yusufkhan@gmail.com");
		dto.setPassword("yusuf@12");
		dto.setDob(new Date());
		dto.setAddress("Indore");

		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(dto);

		tx.commit();

		session.close();

	}

}
