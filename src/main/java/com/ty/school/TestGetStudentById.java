package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetStudentById {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Student student=entityManager.find(Student.class, 4);
		if(student!=null) {
		System.out.println("ID Is:"+student.getId());
		System.out.println("Name Is:"+student.getName());
		System.out.println("Percentage Is:"+student.getPercentage());
	}
	else {
		System.out.println("No Student Exists");
	}
}
	}

