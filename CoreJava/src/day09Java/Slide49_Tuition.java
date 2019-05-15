package day09Java;
import java.util.Scanner;

public class Slide49_Tuition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double tuition = 10000;
		int year=0;
		while (tuition < 20000) {
			tuition = (tuition * 1.07);
			year++;
				
		}
		System.out.println("Number of years:"+year);

	}

}
