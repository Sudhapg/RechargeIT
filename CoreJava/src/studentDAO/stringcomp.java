package studentDAO;

import java.util.Arrays;
public class stringcomp {
	
	public static double average(int a,int b) {
		return a+b/2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int arr[][] = new int[4][];
		arr[0] = new int[4];
		arr[1] = new int[2];
		arr[2] = new int[3];
		
		arr[0][1] = 3;
		
		
		System.out.println("The array is:"+Arrays.deepToString(arr));
		
		int a;
		//System.out.println(a);
		
		System.out.println(average(2,1));
		String s = "apple";
		boolean flag = false;
		if (s == "apple") {
			flag = true;
		}else {flag = false;}
		
		System.out.println(flag);
	}
	

}
