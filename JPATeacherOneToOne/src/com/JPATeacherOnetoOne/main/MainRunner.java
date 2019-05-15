package com.JPATeacherOnetoOne.main;

import com.JPATeacherOnetoOne.services.TeacherOneToOneServices;

public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TeacherOneToOneServices teacher = new TeacherOneToOneServices();
		teacher.createTable();
		
	}

}
