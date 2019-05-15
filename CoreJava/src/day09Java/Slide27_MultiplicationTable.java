package day09Java;
import java.util.Scanner;

public class Slide27_MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1;i<=10;i++) {
			System.out.println("Multiplication table for " + i);
			for(int j=1;j<=10;j++) {
				int k = i*j;
				System.out.println(i+"*"+j+"="+k);
			}
		}
	}
}
