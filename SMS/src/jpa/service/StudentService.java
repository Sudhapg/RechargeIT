package jpa.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.entitymodels.Student;

public class StudentService implements StudentDAO {

	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("SMS");
	static EntityManager manager = factory.createEntityManager();
	
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		System.out.println("inside the method");
		Query query = manager.createQuery("select s from Student s");
		List<Student> students = new ArrayList<Student>();
		students = query.getResultList();
		
		System.out.println("All Student details");
		for(Student s: students) {
			System.out.println(s.toString());
			}
		
		return students;
	}

	@Override
	public Student getStudentByEmail(String email) {
		// TODO Auto-generated method stub
		//Check if there is a student with the given email
		Student student = manager.find(Student.class, email);
		if (student == null) {
			System.out.println("There is no student with that email");
		}
		return student;
	}

	@Override
	public boolean validateStudent(String email, String password) {
		// TODO Auto-generated method stub
		boolean flag;
		Student student = manager.find(Student.class, email);
		if (student == null) {
			System.out.println("Enter a valid Email");
			flag = false;
		}
		//Check if the student's password matches with the userinput
		if(student.getsPass().equals(password)) {
			flag = true;
		}else {flag = false;}
		return flag;
	}

	@Override
	public void registerStudentToCourse(String email, int cId) {
		// TODO Auto-generated method stub
		//Find the student for the given email
		Student student = manager.find(Student.class, email);
		//Find the course for the given course id
		Course course = manager.find(Course.class, cId);
		List<Course> courselist = new ArrayList<Course>();
		courselist = student.getsCourses();
		//check if the student has already been registered to the course
		if(courselist.contains(course)) {
			System.out.println("Student is already registered to the course");
		}else {
			student.getsCourses().add(course);
			manager.getTransaction().begin();
			manager.persist(student);
			manager.getTransaction().commit();
		}
		
	}

	@Override
	public List<Course> getStudentCourses(String email) {
		// TODO Auto-generated method stub
		Student student = manager.find(Student.class, email);
		List<Course> courselist = new ArrayList<Course>();
		courselist = student.getsCourses();
		System.out.println("My Classes:");
			
		return courselist;
	}
	
	
	public static void closeConnection() {
		manager.close();
		factory.close();
	}
}
