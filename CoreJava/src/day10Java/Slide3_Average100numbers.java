package day10Java;
import java.util.Scanner;

public class Slide3_Average100numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double average;
		int sum = 0;
		int count=0;
		int[] arr = new int[100]; //declaring the array
			
		for (int i = 0;i<arr.length;i++) {
		arr[i] = (int)(Math.random()*100);
		sum = sum+arr[i];
		}
		average = sum/arr.length;
		System.out.println("The average is:"+average);
		
		for(int i=0;i<100;i++) {
			if (arr[i] > average) {
				count++;
			}
		}
		System.out.println("Number of elements above average is:"+count);
	}

}
