package homeWork_Arrays;

public class FactorialwithoutRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		int fact = 1;
		int result = 1;
		for (int i = 0;i<num;i++) {
			//num = num -i;
			fact = fact *(num-i);
			System.out.println("Fact is:"+fact);
			
		}
		
		System.out.println(fact);
	}

}
