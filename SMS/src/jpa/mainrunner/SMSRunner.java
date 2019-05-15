package jpa.mainrunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jpa.dao.CourseDAO;
import jpa.dao.StudentDAO;
import jpa.entitymodels.Course;
import jpa.service.CourseService;
import jpa.service.StudentService;

public class SMSRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDAO studentdao = new StudentService();
		CourseDAO coursedao = new CourseService();
		
		try {
		
		//studentdao.registerStudentToCourse("hluckham0@google.ru",1);
		Scanner input = new Scanner(System.in);
		//Ask the user if he is a student
		System.out.println("Are you a(n)");
		System.out.println("1. Student");
		System.out.println("2. Quit");
		System.out.println("Please, enter 1 or 2.");
		int userinput = input.nextInt();
		//If the user is a student , get the email and password
		if (userinput == 1) {
			System.out.println("Enter your Email:");
			String email = input.next();
			System.out.println("Enter your Password:");
			String password = input.next();
			//Validate the student credentials
			if(studentdao.validateStudent(email, password)) {
				//System.out.println("My Classes");
				List<Course> courselist = new ArrayList<Course>();
				courselist = studentdao.getStudentCourses(email);
				System.out.printf("%-10s %-30s %-30s \n","Course ID","Course Name","Instructor Name");
				//Print the all the courses the student is enrolled in
					for (Course c: courselist) {
						System.out.printf("%-10s %-30s %-30s \n",c.getcId(),c.getcName(),c.getcInstructorName());
					//System.out.println(c.toString());
					
				}
					
				
				//Asking the user to Register to a class or logout
				
				System.out.println("1.Register to Class");
				System.out.println("2. Logout");
				int userinput1 = input.nextInt();
				
				if(userinput1 == 1) {
					//Display all the courses to the user to select
					coursedao.getAllCourses();
					System.out.println("Which Course?");
					int userchoice = input.nextInt();
					if(userchoice >=1 && userchoice <= 10) {
					//Register the student to the course
					studentdao.registerStudentToCourse(email, userchoice);
					
					List<Course> studentcourses = new ArrayList<Course>();
					studentcourses = studentdao.getStudentCourses(email);
					System.out.printf("%-10s %-30s %-30s \n","Course ID","Course Name","Instructor Name");
					for (Course c1: studentcourses ) {
						System.out.printf("%-10s %-30s %-30s \n",c1.getcId(),c1.getcName(),c1.getcInstructorName());
						//System.out.println(c1.toString());
					}
					System.out.println("You have been signed out");
					} else {System.out.println("Please enter valid input");	}							
				}else if(userinput1 == 2) {
					System.out.println("You have been signed out");
				}else {
					System.out.println("Please enter valid input");
				}
				
			}else {
				System.out.println("Please check the credentials");
			}
		}else if(userinput == 2) {
			System.out.println("You have been signed out");
		}else {//check for invalid input
			System.out.println("Please enter valid input");
		}
		
		//Close the manager and factory connection
		CourseService.closeConnection();
		StudentService.closeConnection();
		
		}catch(Exception e) {
			System.out.println("Please enter valid details");
		}
		
	}

}
