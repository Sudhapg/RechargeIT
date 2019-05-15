package homeWork_Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class ReversingNumbersinPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr= {10,7,9,3,8};
		int divide = numArr.length/2;//Divide the array by 2
		System.out.println("Divide value:"+divide);
		int temp;
		System.out.println("The original array is:"+Arrays.toString(numArr));
		//Loop through the first half of the array and the 
		//second half of the array to swap the elements
		for(int i=0,j=numArr.length-1; i<divide&&j>=divide;i++,j--) {
			temp = numArr[i];//Assign the first element to temp
			numArr[i] = numArr[j];//Swap the first element and last element
			numArr[j] = temp;
				
		}
	System.out.println("The reversed array is:"+Arrays.toString(numArr));

	}

}
