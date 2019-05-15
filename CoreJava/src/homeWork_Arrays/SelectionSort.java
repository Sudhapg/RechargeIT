package homeWork_Arrays;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,9,8,7,6,10,5,-1};
		int small=0;
		int temp;
		int index=0;
		int x=0;
		System.out.println("The original array is:"+Arrays.toString(arr));
		while (x<arr.length-1) {
		//	System.out.println("X value is:"+x);
			
			small = arr[x];
						
			for(int i=x;i<arr.length;i++) {
				if(arr[i]<=small) {
					small = arr[i];
					index = i;
				}
				
			}
			temp = arr[x];
			arr[x] = small;
			arr[index]= temp;
			if(x!= arr.length-1) {
				x=x+1;
			System.out.println("The small is:"+small);
			}
		}
			//flag = false;
		/*for(int i = x;i<arr.length-1;i++) {
			if (arr[i]>arr[i+1]) {
				small = arr[i+1];
				index = i+1;
							
			}else {small = arr[i];
				index = i;}
			
		}*/
	/*	System.out.println("Small is:"+small);
		temp = arr[x];
		arr[x] = small;
		arr[index]= temp;
		if(x!= arr.length-1) {
			x=x+1;
		}*/
	
			
		System.out.println("the smallest element is:"+small);
		System.out.println("The array is:"+Arrays.toString(arr));
	}

}
