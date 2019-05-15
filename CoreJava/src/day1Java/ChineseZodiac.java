package day1Java;
import java.util.Scanner;

public class ChineseZodiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		String animal;
		
		System.out.println("Please input the value for year:");
		Scanner input = new Scanner(System.in);
		
		year = input.nextInt();
		
		int x = year % 12;
		
		switch (x) {
		case 0: System.out.println("Animal for the year is Monkey");break;
		case 1: System.out.println("Animal for the year is rooster");break;
		case 2: System.out.println("Animal for the year is dog"); break;
		case 3: System.out.println("Animal for the year is pig"); break;
		case 4: System.out.println("Animal for the year is rat"); break;
		case 5: System.out.println("Animal for the year is Ox"); break;
		case 6: System.out.println("Animal for the year is Tiger"); break;
		case 7: System.out.println("Animal for the year is Rabbit"); break;
		case 8: System.out.println("Animal for the year is Dragon");break;
		case 9: System.out.println("Animal for the year is Snake"); break;
		case 10: System.out.println("Animal for the year is Horse");break;
		case 11: System.out.println("Animal for the year is Sheep");break;

		}

	}

}
