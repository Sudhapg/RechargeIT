package fileProcessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyFileReader {

	public static ArrayList<Employee> fileReader(String location) {
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		try {//Another way to handle the exception
			//String location = "D:\\Users\\sudha.pongali\\eclipse-workspace\\CoreJava\\src\\fileProcessing\\text.txt";
			File file = new File(location);
			Scanner input = new Scanner(file);
			//String line1 = input.nextLine();
			//System.out.println(line1);
			
			//The following line returns only single line from the text file
			//String line = input.nextLine();//This is how java reads the file line by line
			//System.out.println(line);
			
			//storing the lines in list
			//ArrayList<String[]> data = new ArrayList<String[]>();
			
			empList = new ArrayList<Employee>();
			input.nextLine();
			String line;
			while(input.hasNextLine()) {
				line = input.nextLine();
				if(!line.equals("")) {
							
				//String line = input.nextLine();
				//data.add(input.nextLine());
				//data.add(line.split(","));//converting the line string to string array
				String[] lineArr = line.split(",");
				empList.add(new Employee(Integer.parseInt(lineArr[0]),lineArr[1],lineArr[2]));
				}
				}
			
			//print
			
			/*for(Employee emp: empList) {
				System.out.println(emp.toString());
			}*/
			
			//print the data from the file
				/*
				 * for(String[] line: data) { //System.out.println(line); for(String token:
				 * line) { System.out.print(token+ " | "); } System.out.println(); }
				 */
			
			/*String data will read the entire file
			String data = "";
			while(input.hasNextLine()) {
				data += input.nextLine();
			}
			System.out.println(data);
			}catch(FileNotFoundException e) {
				System.out.println("File Not Found");
			}*/
			
			}catch(FileNotFoundException e) {
				System.out.println("File not found!");
			}
			catch(NumberFormatException e) {
				System.out.println("Please check the ID format in the file!");
			}
		
		return empList;
	}
}
