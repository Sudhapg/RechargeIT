package jpa.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jpa.dao.CourseDAO;
import jpa.entitymodels.Course;

public class CourseService implements CourseDAO {

	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("SMS");
	static EntityManager manager = factory.createEntityManager();
	
	@Override
	//This method displays all the courses in the Course table
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		
		Query query = manager.createQuery("Select c from Course c");
		List<Course> allcourses = new ArrayList<Course>();
		allcourses = query.getResultList();
		System.out.println("All Courses:");
		System.out.println("Course ID"+"          "+"    Course Name    "+"           "+"     Instructor Name     ");
		for (Course coursedetails: allcourses) {
			System.out.println(coursedetails.toString());
		}
		return allcourses;
	}
	
	public static void closeConnection() {
		manager.close();
		factory.close();
	}

}
