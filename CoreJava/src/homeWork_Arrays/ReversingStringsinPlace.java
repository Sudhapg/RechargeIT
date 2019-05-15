package homeWork_Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class ReversingStringsinPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] stringArr = new char[6];
		char temp;
		
		for (int i=0;i<stringArr.length;i++) {
			stringArr[i]= (char)('a'+Math.random()*('z'-'a'+1));
		}
		System.out.println("The original array is:"+Arrays.toString(stringArr));
		int divide = stringArr.length/2;
		
		for(int i=0,j=stringArr.length-1;(i<divide&&j>=divide);i++,j--) {
			temp = stringArr[i];
			stringArr[i] = stringArr[j];
			stringArr[j] = temp;
		}
		String str = new String(stringArr);//Converting character to String
		System.out.println("The reversed array is:"+Arrays.toString(stringArr));
		System.out.println("The reversed tex is:"+str);
	}
		
}
