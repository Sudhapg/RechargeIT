package day10Java;
import java.util.Scanner;

public class Slide99_TwoDimensionalArrayincrementby10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int[][] arr = new int[3][4];
		for(int i=0;i<3;i++) {
			for (int j=0;j<4;j++) {
				arr[i][j] = x;
				x+=10;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
