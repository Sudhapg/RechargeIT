package day1Java;
import java.util.Scanner;

public class TwoDigitLottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int userinput = 0;
		num = 10 +(int)(Math.random()*90);
		System.out.println("num is" + num);
		
		Scanner input = new Scanner(System.in);
		while ((userinput < 10) || (userinput >=100)){
		try {
		System.out.println("Please enter a 2 digit number:");
		userinput = input.nextInt();
		}catch (Exception e) {
			System.out.println("Please enter a valid 2 digit number");
			input.nextLine();
			continue;
		}
		}
		
		if (userinput == num) {
			System.out.println("Congratulations !! Your prize is $10,000");
		}else if ((userinput%10 == num/10) &&
				(userinput/10) == num%10) {
			System.out.println("Congratulations !! Your prize is $3000");
		}
		else if ((userinput%10== num%10) ||
				(userinput/10 == num/10) || 
				(userinput%10 == num/10) ||
				(userinput/10 == num%10)) {
			System.out.println("Congratulations !! Your prize is $1000");
		}  else {
			System.out.println("Better luck next time !!");
		}
	}

}
