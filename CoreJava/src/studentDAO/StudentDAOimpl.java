package studentDAO;

import java.util.List;
import java.util.ArrayList;

public class StudentDAOimpl implements StudentDAO {

	private ArrayList<Student> students;
	
	public StudentDAOimpl() {
		//this.students = students;
		students = new ArrayList<Student>();
		Student student1 = new Student("James",123);
		Student student2 = new Student("Rob",456);
		Student student3 = new Student("Kevin",789);
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
	}
	
	public ArrayList<Student> getAllStudents() {
		// TODO Auto-generated method stub
		
		
		return students;
	}

	
	public void updateStudent() {
		// TODO Auto-generated method stub
		
	}


	public void deleteStudent() {
		// TODO Auto-generated method stub
		
	}

	
	public void addStudent() {
		// TODO Auto-generated method stub
		
	}

	
	public Student getStudent(int rollNo) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
