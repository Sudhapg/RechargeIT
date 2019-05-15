package studentCourses;
import java.util.List;
public class Student {

	int sId;
	String sName;
	List<Course> sCourses;
	
	Student(int sId, String sName, List<Course> sCourses){
		this.sId = sId;
		this.sName = sName;
		this.sCourses = sCourses;
	}
	
	void printStudent() {
		System.out.println(sId);
		System.out.println(sName);
		for(Course c: sCourses) {
			System.out.println(c.cName);
		}
	}
	
	void dropCourse(String dropCourse) {
		System.out.println(sCourses.size());
		
		Course course;
		boolean deleted = false;
		
		for (int i = 0;i<sCourses.size();i++) {
			if(sCourses.get(i).cName.contentEquals(dropCourse)) {
				sCourses.remove(sCourses.get(i));
				deleted = true;
			}
		}
		
		if(deleted) {
			System.out.println(dropCourse+": Removed sucessfully");
			
		}
		
		
		if(sCourses.contains(dropCourse)) {
			sCourses.remove(dropCourse);
		}else {
			System.out.println("The course you are trying to drop is not in your list");
		}
		
	}
}
