package day09Java;
import java.util.Scanner;
public class Slide23SentinelValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = 0;
		int userinput = -1;
		Scanner input = new Scanner(System.in);
		
		while (userinput != 0) {
			System.out.println("Please enter an input:");
			userinput = input.nextInt();
			result = result + userinput;
			System.out.println("Your total is:"+ result);
			}
		input.close();//close the scanner
	}

}
