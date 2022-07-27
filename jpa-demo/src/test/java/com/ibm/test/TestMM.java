package com.ibm.test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.ibm.dao.MMDao;
import com.ibm.entity.Department;
import com.ibm.entity.Employee;
import com.ibm.entity.Movie;
import com.ibm.entity.Multiplex;

public class TestMM {
	private static MMDao dao;

	@BeforeAll
	public static void setup() {
		dao = new MMDao();
	}

	@Test
	public void testSaveMovie() {
		Movie m1 = new Movie();
		m1.setMovId(2);
		m1.setTitle("BAAHUBALI");
		dao.addMovie(m1);
	}

	@Test
	public void testSaveMul() {
		Multiplex m2 = new Multiplex();
		m2.setMpexId(2);
		m2.setName("IMAX");
		dao.addMultiplex(m2, 10);
	}

	@Test
	public void testFindMovie() {
		Movie m1= dao.findMov(13);
		System.out.println(m1);
		}
	
	@Test
	public void testFindMultiplex() {
		Multiplex m2= dao.findmul(0);
		System.out.println(m2);
	}
}
