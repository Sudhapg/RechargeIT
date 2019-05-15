package day10Java;
import java.util.Scanner;
public class methodsinJava {
	
	public static void myPrinter(int[] x) {
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {5,10,15,20};
		int[] ages = {45,1,3,0};
		
		
		myPrinter(numbers);
		myPrinter(ages);
		
		
		
	}

}
