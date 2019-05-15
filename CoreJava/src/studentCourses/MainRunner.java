package studentCourses;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainRunner {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Student s1 = new Student(1,"Maria",new ArrayList<>());
			
		
		Course c1 = new Course(1,"Core Java");
		Course c2 = new Course(2,"Python");
		Course c3 = new Course(3,"HTML");
		
		List<Course> l1 = new ArrayList<Course>();
		//l1.add(c1);
		l1.add(c2);
		l1.add(c3);
		
		Student s1 = new Student(1,"Maria",l1);
		s1.printStudent();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Which course you want to drop?");
		String dropCourse = input.nextLine();
				
		//Calling the method to drop the course
		s1.dropCourse(dropCourse);
		
		s1.printStudent();
		
		/*System.out.println(s1.sId);
		System.out.println(s1.sName);
		for(Course c:l1) {
			System.out.println(c.cName);
		}*/
	}

}
