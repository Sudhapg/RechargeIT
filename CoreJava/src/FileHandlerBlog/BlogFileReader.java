package FileHandlerBlog;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BlogFileReader {
	
	//Method fileReader to read the contents of the file 
	// and return the contents as hashmap
	public static HashMap<String,String> fileReader(String location){
	
		HashMap<String,String> hmap = new HashMap<String,String>();
		
		try {
			
			File file = new File(location);
			Scanner fileinput = new Scanner(file);
			fileinput.nextLine();
			String line;
			while(fileinput.hasNextLine()){
				line = fileinput.nextLine();// reading the line into string
				if(!line.equals("")) {
					String[] lineArr = line.split(",");//this returns the string as an array
					hmap.put(lineArr[0],lineArr[1]);// add the string array content into hashmap
				}
			}
			
			/*
			 * for(Map.Entry<String,String> entry: hmap.entrySet()) {
			 * System.out.println(entry.getKey()); System.out.println(entry.getValue());
			 * 
			 * }
			 */
			
			
		}catch(FileNotFoundException e) {
			System.out.println("File not found!");
		}
		
		return hmap;// returning the contents of the file as hashmap
	}

}
