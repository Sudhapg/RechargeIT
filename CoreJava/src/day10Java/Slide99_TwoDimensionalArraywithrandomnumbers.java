package day10Java;
import java.util.Scanner;
public class Slide99_TwoDimensionalArraywithrandomnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = new int[3][4];
		char[][] arr2 = new char[3][4];
		for (int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				arr[i][j] = (int)(Math.random()*100);
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				arr2[i][j] = (char)('a'+Math.random()*('z'-'a'+1));
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}

}
