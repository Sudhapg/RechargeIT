package com.JPATeacherOnetoOne.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.JPATeacherOnetoOne.entities.Credentials;
import com.JPATeacherOnetoOne.entities.Teacher;

public class TeacherOneToOneServices {
	public void createTable() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPATeacherOneToOne");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		
		  Teacher teacher = new Teacher();
		  teacher.setSalary(10000);
		  teacher.setTname("Bairon");
		  //teacher.setId(1);
		  
		  Credentials credentials = new Credentials();
		
		  credentials.setUsername("Bairon"); 
		  credentials.setPwd("Pass123");
		  credentials.setTeacher(teacher);
		  teacher.setCredentials(credentials);
		 
				
		  Teacher teacher1 = new Teacher(); teacher1.setSalary(20000);
		  teacher1.setTname("Mike"); teacher1.setId(2);
		  
		  Credentials credentials1 = new Credentials();
		  credentials1.setUsername("Mike"); credentials1.setPwd("Pass124");
		  credentials1.setTeacher(teacher1); teacher1.setCredentials(credentials1);
		 
		 		
		  manager.persist(teacher); manager.persist(credentials);
		 
		
		
		  manager.persist(teacher1); manager.persist(credentials1);
		 
		
		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
}
