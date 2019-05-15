package day09Java;
import java.util.Scanner;

public class Slide53_PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2;
		int divisor = 0;
		int count = 0;
		System.out.println("The first 20 prime numbers:");
		while (count < 20 ) {
			for (int i = 2;i<=num;i++) {
				if ((num%i)== 0) {
					divisor++;// counts the number of divisors
				}
				}
			if (divisor==1) {
				System.out.println(num);
				count++;//increments the count for number of prime numbers
			}
			num++;
			divisor = 0;

		}
	}
}
