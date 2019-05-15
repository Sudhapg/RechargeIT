package day09Java;
import java.util.Scanner;

public class JavaDay09RepeatAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 5;
		int num2 = 5;
		int userinput;
		System.out.println("what is 5 + 5:");
		Scanner input = new Scanner(System.in);
		userinput = input.nextInt();
		
		while (userinput != (num1+num2)) {
			System.out.println("Answer is wrong. Please try again !!");
			input.nextLine();
			userinput = input.nextInt();
			continue;
		}
		
		System.out.println("Good Job !!");
	}

}
