package day10Java;
import java.util.Arrays;
import java.util.Scanner;

public class Slide95_TwodimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numberArr = new int[3][5];
		numberArr = new int[][] {{10,12,43,11,22},
			{20,45,56,1,33},
			{30,67,32,14,44}};
		System.out.println(Arrays.toString(numberArr[0]));
		System.out.println(numberArr[1][2]);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(numberArr[i][j]+ " ");
			}
			System.out.println("");
		}

	}
	
	

}
