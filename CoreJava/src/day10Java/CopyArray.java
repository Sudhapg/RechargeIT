package day10Java;
import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] list1 = {1,2,3,4,9,10};
		int[] list2 = {9,8,7,6};
		
		list2 = list1;//Copying list1 array into list2 array
		
		list1[2] = 99;//even if one array is changed it reflects in both the arrays
		System.out.println(Arrays.toString(list1));
		System.out.println(Arrays.toString(list2));
		System.out.println(list1);//Both the arrays point to the same memory
		System.out.println(list2);
	}

}
