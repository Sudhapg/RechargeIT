package homeWork_Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class Stringfunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your string:");
		String s = input.next();
		s = s.replaceAll("\\s+", "");
		String[] sArr = s.split(",");
		System.out.println("The new array is:"+Arrays.toString(sArr));
		//String x = new String(sArr[]);
		
	}

}
