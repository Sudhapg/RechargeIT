package homeWork_Arrays;

public class FibonacciwithRecursion {
	
	public static int fibonacci(int num) {
		if (num == 0) {
			return 0;}
		else if (num==1){
			 return 1;}
		else {
			int result= fibonacci(num-1)+fibonacci(num-2);
			
			return result;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int num = 5;
		System.out.println(fibonacci(5));

	}

}
