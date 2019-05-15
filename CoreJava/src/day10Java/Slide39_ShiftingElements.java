package day10Java;
import java.util.Arrays;
import java.util.Scanner;

public class Slide39_ShiftingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myList = {10,9,7,3};
		int temp = myList[myList.length-1];
		
		
		
		 for(int i=myList.length-2;i>=0;i--) {
			 myList[i+1] = myList[i];
		 }
		 myList[0] = temp;
		 System.out.println("New array is:"+Arrays.toString(myList));
		
	}

}
