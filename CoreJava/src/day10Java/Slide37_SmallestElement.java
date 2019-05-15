package day10Java;
import java.util.Scanner;

public class Slide37_SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-100,3,-5,-2,4};
		
		int min = arr[0];
		for (int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}

		System.out.println("The smallest element is:"+min);

	}

}
