package day10Java;
import java.util.Scanner;
import java.util.Arrays;
public class Slide39_Rightshiftelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		int[] arr= {10,9,7,3};
		for (int i = 0;i<2;i++) {
			temp = arr[arr.length-1];
			for (int j= arr.length-1;j>0;j--) {
				arr[i] = arr[i-1];
				arr[i]=temp;
			}
		}
		System.out.println("The new array is:"+ Arrays.toString(arr));
	}

}
