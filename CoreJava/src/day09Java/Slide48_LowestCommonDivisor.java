package day09Java;

import java.util.Scanner;

public class Slide48_LowestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int smallnumber;
		int largenumber;
		int count = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first integer");
		num1 = input.nextInt();
		System.out.println("Please enter your second integer");
		num2 = input.nextInt();
		if(num1<num2) {
			smallnumber = num1;
			largenumber = num2;
		}else {
			smallnumber = num2;
			largenumber = num1;
		}
		for (int i= 2;i<=smallnumber;i++ ) {
			if ((num1%i == 0)&& (num2%i == 0)) {
				count = i;
				System.out.println("The LCD is:"+count);
				//System.out.println("The common divisor for "+num1 + 
								//"and "+ num2 + "is:"+i);
				break;
				}
					
				}
		//System.out.println("The GCD is:"+count);
		}


	}

