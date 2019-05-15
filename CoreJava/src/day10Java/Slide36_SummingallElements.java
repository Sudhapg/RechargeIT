package day10Java;
import java.util.Scanner;
public class Slide36_SummingallElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		
		//Declaring and initializing a variable to hold the sum 
		//after each iteration
		double total = 0;
		
		//for loop to iterate through the array and sum all elements
		for(int i = 0;i<arr.length;i++) {
			total += arr[i];
		}
		System.out.println("The total is:"+total);

	}

}
