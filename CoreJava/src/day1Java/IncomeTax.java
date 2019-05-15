package day1Java;
import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double income = 0.0;
		int status = 0;
		double tax= 0.0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your income:");
		try {
		income = input.nextDouble();}
		catch(Exception e) {
			System.out.println("Please enter valid number");
			input.nextLine();
			
		}
		System.out.println("Enter 1 for filing Single:");
		System.out.println("Enter 2 for filing Married & joint:");
		System.out.println("Enter 3 for filing Married & filing separate:");
		System.out.println("Enter 4 for Head of household:");
		//status = input.nextInt(); 
		try {
			status = input.nextInt();
		}catch (Exception e) {
			System.out.println("Please enter valid number");
			input.nextLine();
			
		}
		
		if (income < 0) {
			System.out.println("Please enter a valid income");
		}
		if (status == 1) {
			System.out.println("inside if");
			if (income >=0 && income <= 8350) {
				System.out.println("inside if");
				tax = ((10.0/100)* income);
				System.out.println("tax is:"+tax);
				
				System.out.println("tax is:"+ tax);
				}
			if (income >= 8351 && income <= 33950) {
				tax = ((15.0/100)*income);
				}
			if (income >= 33951 && income <= 82250) {
				tax = ((25.0/100)*income);
			}
			if (income >= 82251 && income <= 171550) {
				tax = ((28.0/100)* income);
			}
			if (income >= 171551 && income <= 372950) {
				tax = ((33.0/100) * income);
			} 
			if (income > 372950) {
				tax = ((35.0/100)* income);
			}
			
		} else if( status == 2) {
			if (income >= 0 && income <= 16700) {
				tax = ((10.0/100)* income);
			}
			if ( income >= 16701 && income <= 67900) {
				tax = ((15.0/100)*income);
			}
			if (income >= 67901 && income <= 137050) {
				tax = ((25.0/100)*income);
			}
			if (income >= 137051 && income <= 208850) {
				tax = ((28.0/100)* income);
			}
			if(income >= 208851 && income <= 372950) {
				tax = ((33.0/100) * income);
			} if(income > 372950) {
				tax = ((35.0/100)* income);
			}
		}else if (status == 3) {
			if (income >= 0 && income <= 8350) {
				tax = ((10.0/100)* income);
			}
			if (income >= 8351 && income <= 33950) {
				tax = ((15.0/100)*income);
			}
			if (income >= 33951 && income <= 68525) {
				tax = ((25.0/100)*income);
			}
			if (income >= 68526 && income <= 104425) {
				tax = ((28.0/100)* income);
			}
			if (income >= 104426 && income <= 186475) {
				tax = ((33.0/100) * income);
			}
			if(income > 186475) {
				tax = ((33.0/100) * income);
			}
		}else if(status == 4) {
			if (income >=0 && income <= 11950) {
				tax = ((10/100)* income);
			}
			
			if (income >= 11951 && income <= 45500) {
				tax = ((15/100)*income);
			}
			if (income >= 45501 && income <= 117450) {
				tax = ((25/100)*income);
			}
			if (income >= 117451 && income <= 190200) {
				tax = ((28/100)* income);
			}
			if (income >= 190201 && income <= 372950) {
				tax = ((33/100) * income);
			} 
			if (income > 372950) {
				tax = ((33/100) * income);
			}
			
		}else if(status <1 || status >4){
			System.out.println("Please enter valid status!!");
		}
		System.out.printf("Your tax is : $%,.2f\n", tax);
	}

}
