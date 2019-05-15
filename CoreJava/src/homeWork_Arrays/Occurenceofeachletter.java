package homeWork_Arrays;
import java.util.Scanner;
public class Occurenceofeachletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		String str = "Jjava Basics";
		char[] chararr = str.toCharArray();
		for(int i=0;i<chararr.length;i++) {
			for(int j=0;j<chararr.length;j++) {
			
				if(chararr[i] == chararr[j]	) {
					count++;
				}
		}
			System.out.println("The occurence of "+chararr[i]+"is: "+count);
			count = 0;
	}

}
}