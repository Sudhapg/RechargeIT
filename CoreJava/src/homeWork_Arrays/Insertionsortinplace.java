package homeWork_Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Insertionsortinplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = input.nextInt();
		int[] arr = new int[size+1];
		int index = 0;
		
		for (int i = 0;i<arr.length-1;i++) {
			System.out.println("Enter the elements of the array:");
			arr[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		System.out.println("Enter the element to be inserted");
		int key = input.nextInt();
		System.out.println(arr.length-1);
		for (int i = 0;i<=arr.length-2;i++) {
			if ((key > arr[i])&& (key <arr[i+1])){
				 index = i+1;
			}else if (key <arr[i]) {
				index = i;
			}else if (key >arr[arr.length-2]) {
				index = arr.length-1;
			}else if ((key>arr[i] && key >arr[i+1])) {
				continue;
			}
			
				//System.out.println("index value is:"+index);
				for (int j = arr.length-1;j>index;j--) {
					arr[j]= arr[j-1];
				}
				arr[index]= key;
				break;
		}
		
		//break;
		
		System.out.println("The new array is:"+Arrays.toString(arr));
}
}
