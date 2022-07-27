package com.ibm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ibm.entity.Department;
import com.ibm.entity.Employee;
import com.ibm.entity.Movie;
import com.ibm.entity.Multiplex;

public class MMDao {
	private EntityManagerFactory factory;
	
	public MMDao() {
		factory = Persistence.createEntityManagerFactory("MYJPA");
	}
	public int addMovie(Movie m1) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(m1);
		tx.commit();
		em.close();
		return m1.getMovId();
	}
	public int addMultiplex(Multiplex m2,int movId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(m2);
		tx.commit();
		em.close();
		return m2.getMpexId();
	}
	public Movie findMov(int movId) {
		EntityManager em = factory.createEntityManager();
		Movie d = em.find(Movie.class, movId);
		return d;
	}

	public Multiplex findmul(int mpexId) {
		EntityManager em = factory.createEntityManager();
		return em.find(Multiplex.class, mpexId);

	}
}
