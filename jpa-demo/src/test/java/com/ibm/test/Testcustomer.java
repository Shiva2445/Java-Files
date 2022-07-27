package com.ibm.test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.ibm.dao.customerDao;
import com.ibm.entity.customer;

public class Testcustomer {
	private static customerDao dao;

	@BeforeAll
	public static void setup() {
		dao = new customerDao();
	}

	@Test
	public void testsave() {
		customer c = new customer(211, "hoo", 2000);
		dao.save(c);
	}

	@Test
	public void testfetch() {
		customer c = dao.fetch(1);
		assertNotNull(c);
		System.out.println(c);
	}
	@Test
	public void testList() {
		List<customer>customers=dao.list();
		assertFalse(customers.isEmpty());
		customers.forEach(System.out::println);
	}
	@Test
	public void testUpdate() {
		customer c =new customer(123,"Frank",12345);
		assertTrue(dao.update(c));
	}
	@Test
	public void testDelete() {
		boolean c =dao.delete(1);
		System.out.println(c);

	}
	
}
