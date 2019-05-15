package day10Java;
import java.util.Scanner;

public class Stringcomparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Java";
		String s2 = "Java";
		System.out.println(s1 == s2);
		
		s1=s1+ " is fun";
		System.out.println(s1 == "Java is fun");
		System.out.println(s1.contains("J"));//Contains searches for that particular character in the string
		System.out.println(s1.endsWith("A"));//Checking the last character
		System.out.println(s1.equalsIgnoreCase("b"));//Ignores the case of the character it is searching for
		System.out.println(s1.indexOf("J"));
		
		int n1 = 5;
		int n2=5;
		System.out.println(n1 == n2);
		
		n1 = n1+5;
		System.out.println(n1 == new Integer(10));
		
		Integer x1 = 5;
		Integer x2 = 5;
		System.out.println(x1 == x2);
		
		x1 = x1+5;
		System.out.println(x1 == new Integer(10));
	}

}
