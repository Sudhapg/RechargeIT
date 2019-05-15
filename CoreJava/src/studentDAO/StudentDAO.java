package studentDAO;
import java.util.List;
import java.util.ArrayList;

public interface StudentDAO {
	
	ArrayList<Student> getAllStudents() ;
	public Student getStudent(int rollNo);
	void updateStudent();
	void deleteStudent();
	void addStudent();
	
	}


