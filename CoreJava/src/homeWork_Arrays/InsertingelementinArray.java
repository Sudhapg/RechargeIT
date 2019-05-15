package homeWork_Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class InsertingelementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr;
 		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size = input.nextInt();
		String[] arr = new String[size+1];
		System.out.println(arr.length);
		System.out.println("Enter the elements of the array:");
		/*for (int i = 0;i<size;i++) {
			arr[i] = input.nextInt();
		}*/
		
		String temp;
		
		String[] str1 = new String[3];
		str1 = "a,b".split(",");
		System.out.println("str1 length: "+str1.length);
		System.out.println("str1: "+str1[2]);

		
		String list = input.nextLine();
		 arr = list.split(",");
		 System.out.println(Arrays.toString(arr));
		 System.out.println("Enter the position where you want to insert");
		 int index = input.nextInt();
		 System.out.println("Enter the element you want to insert");
		 String key = input.next();
		 System.out.println(arr.length);
		 for (int i = arr.length-2;i>index;i--) {
			 System.out.println("i value:"+i);
			arr[i+1] = arr[i];
			
			}
			arr[index] = key;
		 
		 System.out.println("The new array is:"+Arrays.toString(arr));
	}

}
