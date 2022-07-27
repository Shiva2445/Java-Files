package com.ibm.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.ibm.entity.customer;
import com.mysql.cj.Query;

public class customerDao {
	private EntityManagerFactory factory;

	public customerDao() {
		factory = Persistence.createEntityManagerFactory("MYJPA");
	}

	public void save(customer c) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(c);
		tx.commit();
		em.close();
	}

	public customer fetch(int id) {
		EntityManager em = factory.createEntityManager();
		customer c = em.find(customer.class, id);
		return c;

	}

	public List<customer> list() {
		EntityManager em = factory.createEntityManager();
		javax.persistence.Query q = em.createQuery("from customer");
		return q.getResultList();

	}

	public boolean update(customer c) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.merge(c);
		tx.commit();
		em.close();
		return true;
	}

	public boolean delete(int id) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		customer c = em.find(customer.class, id);
		em.remove(c);
		tx.commit();
		em.close();
		return true;
	}

}
