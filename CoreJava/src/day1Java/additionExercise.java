package day1Java;
import java.util.Scanner;

public class additionExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		int num2;
		int sum;
		
		num1 = 0 +(int)(Math.random()*100);
		num2 = 0 + (int)(Math.random()*100);
		
		Scanner input = new Scanner(System.in);
		System.out.println("what is"+ num1 + "+" + num2);
		sum = input.nextInt();
		
		if ((num1+num2) == sum) {
			System.out.println("Answer is correct");
		} else {
			System.out.println("Answer is Wrong. Please Try again !!");
		}

	}

}
