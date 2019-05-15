package day10Java;
import java.util.Arrays;
import java.util.Scanner;
public class Slide39_ShiftingElementsby2positions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,9,7,3};
		int[] temp = new int[arr.length] ;
		
		temp[0] = arr[0];
		temp[1] = arr[1];
		
		for (int i=0;i<2;i++) {
			arr[i] = arr[i+2];
		}
		for(int i=2;i<arr.length;i++) {
			arr[i] = temp[i-2];
			}
		
		System.out.println("New array is:"+Arrays.toString(arr));

	}

}
