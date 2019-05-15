package day10Java;
import java.util.Arrays;
import java.util.Scanner;

public class Slide38_Randomshuffling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myList = {1,2,3,4,5};
		for (int i= myList.length-1;i>0;i--) {
			System.out.println (Math.random()*(i+1));
			int j = (int)(Math.random()*(i+1));
			System.out.println(j);
			
			int temp = myList[i];
			myList[i] = myList[j];
			myList[j] = temp;
			System.out.println("temp:"+temp);
			System.out.println("myList[i]:"+myList[i]);
			System.out.println("myList[j]:"+myList[j]);
		}
		System.out.println("New array is:"+Arrays.toString(myList));
	}

}
