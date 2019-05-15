package day10Java;
import java.util.Scanner;

public class Slide32_ArrayswithInputValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = new int[5];
		Scanner input = new Scanner(System.in);
		//If you want to take 5 numbers for user and store it in the array
		for(int i=0;i<5;i++) {
			System.out.println("Enter number"+(i+1)+": ");
			arr[i] = input.nextInt(); //Taking user input
		
		}
		
		// For printing those numbers
		for(int i=0;i<5;i++) {
			System.out.println("Number"+ (i+1)+": "+arr[i]);
		}
		
		System.out.println("arr:"+arr);

	}

}
