package homeWork_Arrays;

public class Recursion {
	
	public static void sub(int x) {
		
		if (x!=0) {
		 x = x-2;
		 System.out.println(x);
		 sub(x);
		}
		if (x==0) {
			System.out.println("Reached 0");
			//return 1;
		}
		//return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		sub(x);

	}

}
