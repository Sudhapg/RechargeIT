package day10Java;
import java.util.Scanner;

public class Slide33_ArrayswithRandomValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of elements in your array");
		length = input.nextInt();
		int arr[] = new int[length];
		for(int i=0;i<arr.length;i++) {
			arr[i]= (int)(Math.random()*100);
			
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Number "+i+1+" : "+arr[i]);
		}
	}

}
