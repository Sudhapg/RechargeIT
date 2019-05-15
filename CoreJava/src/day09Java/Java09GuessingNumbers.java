package day09Java;
import java.util.Scanner;

public class Java09GuessingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0 +(int)(Math.random()*100);
		System.out.println(num);
		System.out.println("Please guess the number:");
		Scanner input = new Scanner(System.in);
		int userinput = input.nextInt();
		
		while (userinput != num) {
			if (userinput < num) {
				System.out.println("Input is too low. Try Again !!");
				userinput = input.nextInt();
				} else if (userinput > num) {
					System.out.println("Input is too high. Try Again !!");
					userinput = input.nextInt();
				}
		}
		
		System.out.println("Good Job !!");
	}

}
