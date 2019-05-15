package FileHandlerBlog;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

import fileProcessing.MyFileReader;
import fileProcessing.MyFileWriter;

public class BlogRunner {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Boolean flag = false;
		int count = 0;
		String uname="";
		String pwd ="";
		String location = "D:\\Users\\sudha.pongali\\eclipse-workspace\\CoreJava\\src\\FileHandlerBlog\\credentials";
		
		String bloglocation = "D:\\Users\\sudha.pongali\\eclipse-workspace\\CoreJava\\src\\FileHandlerBlog\\myBlog";
		Scanner input = new Scanner(System.in);
		while (count < 3) {
			System.out.println("Please enter your username:");
			uname = input.nextLine();
			System.out.println("Please enter your password");
			pwd = input.nextLine();
			count++;
			HashMap<String,String> hmap = BlogFileReader.fileReader(location);
		
			for(Map.Entry<String,String> entry: hmap.entrySet()){
				//System.out.println("Hi");
				if(uname.equals(entry.getKey()) && 
						pwd.equals(entry.getValue())) {
					flag = true;
					
				}
			}
		}
		System.out.println(flag);
		
		if (flag) {
			System.out.println("inside true");
			System.out.println("What do you want to add to the file");
			String line1 = input.nextLine();
			BlogFileWriter.fileWriter(bloglocation,line1,uname);
		}
		
		if(!flag) {
			System.out.println("Sorry, Wrong Username,Password!");
		}
		
	}

}
