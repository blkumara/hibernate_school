package com.ty.school;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveParent {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Parent parent = new Parent();
		parent.setName("pavana");
		parent.setEmail("pavana@gmail.com");
		parent.setPhone(7411955968l);

		entityTransaction.begin();

		entityManager.persist(parent);

		entityTransaction.commit();

	}

}
