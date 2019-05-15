package ExceptionHandling;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please provide the divisor:");
		try {
			int number = input.nextInt();
			int i = 1/number;
			System.out.println("Result is:"+i);
			
			int[] numbers = {1,2,3,4,5};
			System.out.println(numbers[5]);
		} catch(ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("That was an arithmetic division error occured by 0!");
			System.out.println("Please try again");
		}catch(InputMismatchException e) {
			System.out.println("Please provide a number");
			System.out.println("Please try again");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The highest index you can use is 4");
		}
		finally {//This block is executed irrespective of the catch block
			System.out.println("That's it! You tried your best!");
		}
		System.out.println("Outside of try-catch-finally");
	}

}
