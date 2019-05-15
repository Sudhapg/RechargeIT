package com.SMS.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jpa.entitymodels.Student;
import jpa.service.StudentService;

public class StudentServiceTest {
	
	StudentService ss = new StudentService();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testGetAllStudents() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetStudentByEmail() {
		
		Student expectedstudent = new Student();
		expectedstudent.setsEmail("hluckham0@google.ru");
		expectedstudent.setsName("Hazel Luckham");
		expectedstudent.setsPass("X1uZcoIh0dj");
		
		Student actualstudent = new Student();
		actualstudent = ss.getStudentByEmail("hluckham0@google.ru");
		
		  System.out.println("expectedstudent:");
		  System.out.println(expectedstudent.getsName());
		  System.out.println(expectedstudent.getsPass());
		  System.out.println(expectedstudent.getsEmail());
		 
		
		System.out.println("actualstudent:");
		System.out.println(actualstudent.getsName());
		System.out.println(actualstudent.getsPass());
		System.out.println(actualstudent.getsEmail());
		
		assertEquals(expectedstudent,actualstudent);
		
		//assertEquals(expectedstudent.getsName(),actualstudent.getsName());
		//assertEquals(expectedstudent,actualstudent);
		
		
		//fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testValidateStudent() {
		String email = "hluckham0@google.ru";
		String pwd = "X1uZcoIh0dj";
		
		boolean expected = ss.validateStudent(email, pwd);
		assertTrue(expected);
		//fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testRegisterStudentToCourse() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetStudentCourses() {
		fail("Not yet implemented"); // TODO
	}

}
