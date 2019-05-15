package fileProcessing;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class MainRunner {

	/*Adding throws FileNotFoundException in the main block 
	 * will handle that case for the entire main method
	 */
	
	
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		String location = "D:\\Users\\sudha.pongali\\eclipse-workspace\\CoreJava\\src\\fileProcessing\\text.txt";
		//MyFileReader.fileReader(location);
		
		ArrayList<Employee> empList = MyFileReader.fileReader(location);
		for(Employee emp: empList) {
			System.out.println(emp.toString());
		}
		
		Employee emp1 = new Employee(003,"Tom","San Jose");
		Employee emp2 = new Employee(004,"David","California");
		Employee emp3 = new Employee(005,"John","Portland");
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		MyFileWriter.fileWriter(location,empList);
		
		}

}
