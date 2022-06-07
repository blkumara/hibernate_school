package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetVisitorById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Visitor visitor = entityManager.find(Visitor.class, 1);
		if (visitor != null) {
			System.out.println("ID Is:" + visitor.getId());
			System.out.println("Name Is:" + visitor.getName());
			System.out.println("Percentage Is:" + visitor.getEmail());
			System.out.println("Percentage Is:" + visitor.getDOB());
			System.out.println("Percentage Is:" + visitor.getVisitDateTime());
			System.out.println("Percentage Is:" + visitor.getGender());
		} else {
			System.out.println("No Visitor Found");
		}
	}
}
