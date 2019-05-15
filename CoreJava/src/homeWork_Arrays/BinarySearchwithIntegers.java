package homeWork_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchwithIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				Scanner input = new Scanner(System.in);
				int[] searchArr = {2,5,10,11};
				System.out.println("The array is:"+Arrays.toString(searchArr));
				System.out.println("Enter the key to be searched");
						int key = input.nextInt();		
				
				int divide = searchArr.length/2;
				/*if (searArr.length == 0) {
					
				}*/
				if (divide == 0&&searchArr.length==1) {
					if (key == searchArr[0]) {
						System.out.println("The key is located at:"+0+" position");
						
					}
				}
				
				if (key < searchArr[divide]) {
					divide = divide/2;
					if(key<searchArr[divide]) {
					for (int i = 0;i<divide;i++) {
						if (key== searchArr[i]) {
							System.out.println("The Key is located at: "+i+" position");
							break;
						}
					}
					}
				}else {
					for (int j = divide; j<=searchArr.length-1;j++) {
						if (key == searchArr[j]) {
							System.out.println("The Key is located at:"+j+" position");
							break;
						}
					}
				}
				


	}

}
