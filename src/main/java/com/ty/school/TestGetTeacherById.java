package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetTeacherById {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Teacher teacher = entityManager.find(Teacher.class, 1);
		if (teacher != null) {
			System.out.println("ID Is:" + teacher.getId());
			System.out.println("Name Is:" + teacher.getName());
			System.out.println("Percentage Is:" + teacher.getEmail());
			System.out.println("Percentage Is:" + teacher.getPhone());
			System.out.println("Percentage Is:" + teacher.getGender());
		} else {
			System.out.println("No Teacher Found");
		}
	}
}
