package homeWork_Arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		int[] arr = {5,4,3,2,10,11};
		int temp;
		System.out.println("The original array is:"+Arrays.toString(arr));
		
		while(flag){
			flag = false;
		for (int i = 0;i<arr.length-1;i++) {
			
			if (arr[i]>arr[i+1]) {
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				flag = true;
			}
		}

	}
		System.out.println("The sorted array is:"+Arrays.toString(arr));
	}

}
