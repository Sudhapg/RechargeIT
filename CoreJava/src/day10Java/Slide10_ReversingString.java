package day10Java;
import java.util.Scanner;
import java.util.Arrays;

public class Slide10_ReversingString {
	
	public static char[] reverse(char[] list) {
		char[] result = new char[list.length];
		
		for(int i=0,j=result.length-1;i<list.length;i++,j--) {
			result[j]=list[i];
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myText = "I see i and j in my dream";
		
		char[] chars = myText.toCharArray();//Converting String to character
		
		char[] list2 = reverse(chars); // Calling the function to reverse the string
		System.out.println(list2);
		String rev = new String(list2);//This String function converts characters to string
						
		System.out.println("The reversed string array is:"+rev);
		

	}

}
