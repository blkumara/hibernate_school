package com.ty.school;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveVisitor {
	public static void main(String[] args) {
		
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Visitor visitor = new  Visitor();
		visitor.setId(1);
		visitor.setName("tejas");
		visitor.setEmail("tejas@gmail.com");
		visitor.setDOB(LocalDate.of(1999, 9, 22));
		visitor.setVisitDateTime(LocalDateTime.now());
		visitor.setGender("male");
		
		entityTransaction.begin();
		
		entityManager.persist(visitor);
		
		entityTransaction.commit();
		
		System.out.println("++++++++++Done+++++++++++++");
		
		
		
	}
}
