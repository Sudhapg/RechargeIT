package homeWork_Arrays;

public class FactorialusingRecursion {
	
	public static int factorial(int x) {
		if (x==0) {
			return 1;
		}else {
			return(x*factorial(x-1));
		}
					
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 3;
		System.out.println(factorial(x));

	}

}
