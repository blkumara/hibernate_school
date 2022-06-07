package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateTeacher {
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Teacher teacher = new Teacher();
		teacher.setId(1);
		teacher.setName("vikasbhanavara");
		teacher.setEmail("vikasbhanavara@gmail.com");
		teacher.setGender("male");
		teacher.setPhone("6859635185");

		entityTransaction.begin();

		entityManager.merge(teacher);

		entityTransaction.commit();
	}

}
