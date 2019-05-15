package day09Java;
import java.util.Scanner;

public class Java09AdvancedMathTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		int count = 0;
		for (i = 0; i< 5;i++) {
		int num1 = 0 +(int)(Math.random()*100);
		int num2 = 0 +(int)(Math.random()*100);
		
		System.out.println("What is "+num1 + "-"+ num2);
		Scanner input = new Scanner(System.in);
		 int userinput = input.nextInt();
		 while (userinput == (num1-num2)) {
			 count++;
			 break;
		 }
		}
		if (count > 0) {
		System.out.println("You got "+count+ " answers right!!");
		} else {
			System.out.println("Good luck, next time !!");
		}
	}

}
