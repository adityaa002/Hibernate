
package com.rays.user;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.sound.midi.Soundbank;

public class TestUserModel {

	public static void main(String[] args) {

//		testAdd();
//		testUpdate();
//		testGet();
//		testDelete();
//		testAuth();
		testSearch();

	}

	private static void testSearch() {
		UserDTO dto = new UserDTO();

		UserModel model = new UserModel();

		//dto.setFirstName("s");

		List list = model.testSearch(dto, 0, 10);

		Iterator it = list.iterator();

		while (it.hasNext()) {
			dto = (UserDTO) it.next();

			System.out.print(dto.getId());
			System.out.print("\t" + dto.getFirstName());
			System.out.print("\t" + dto.getLastName());
			System.out.print("\t" + dto.getLoginId());
			System.out.print("\t" + dto.getPassword());
			System.out.print("\t" + dto.getDob());
			System.out.println("\t" + dto.getAddress());
		}

	}

	private static void testAuth() {
		UserModel model = new UserModel();

		UserDTO dto = model.authenticate("adItya02@gmail.com", "1234");

		if (dto != null) {
			System.out.println(dto.getId());
			System.out.println(dto.getFirstName());
			System.out.println(dto.getLastName());
			System.out.println(dto.getLoginId());
			System.out.println(dto.getPassword());
			System.out.println(dto.getAddress());
			System.out.println("Authentication success");

		} else {
			System.out.println("Authentication failed...!!!");
		}

	}

	private static void testDelete() {

		UserDTO dto = new UserDTO();
		dto.setId(2);

		UserModel model = new UserModel();

		model.delete(dto);

	}

	private static void testGet() {

		UserModel model = new UserModel();

		UserDTO dto = model.findByPk(1);

		System.out.println(dto.getId());
		System.out.println(dto.getFirstName());
		System.out.println(dto.getLastName());
		System.out.println(dto.getLoginId());
		System.out.println(dto.getPassword());
		System.out.println(dto.getDob());
		System.out.println(dto.getAddress());

	}

	private static void testUpdate() {
		UserDTO dto = new UserDTO();
		dto.setId(1);
		dto.setFirstName("adi");
		dto.setLastName("sharma");
		dto.setLoginId("aditya02@gmail.com");
		dto.setPassword("1234");
		dto.setDob(new Date());
		dto.setAddress("bhopal");

		UserModel model = new UserModel();
		model.update(dto);
	}

	private static void testAdd() {

		UserDTO dto = new UserDTO();
		dto.setFirstName("sandeep");
		dto.setLastName("gujjar");
		dto.setLoginId("sandygujjar@gmail.com");
		dto.setPassword("968");
		dto.setDob(new Date());
		dto.setAddress("bhopal");

		UserModel model = new UserModel();

		model.add(dto);

	}
}
