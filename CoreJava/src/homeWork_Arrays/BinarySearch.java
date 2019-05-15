package homeWork_Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the list of numbers:");
		String arr = input.next();
		String[] searchArr = arr.split(",");
		System.out.println("Please enter the key to be searched:");
		String key = input.next();
		int divide = searchArr.length/2;
		/*if (searArr.length == 0) {
			
		}*/
		if (divide == 0&&searchArr.length==1) {
			if (Integer.parseInt(key) == Integer.parseInt(searchArr[0])) {
				System.out.println("The key is located at:"+0+" position");
				
			}
		}
		
		if (Integer.parseInt(key) < Integer.parseInt(searchArr[divide])) {
			for (int i = 0;i<divide;i++) {
				if (Integer.parseInt(key)== Integer.parseInt(searchArr[i])) {
					System.out.println("The Key is located at: "+i+" position");
					break;
				}
			}
		}else {
			for (int j = divide; j<=searchArr.length-1;j++) {
				if (Integer.parseInt(key) == Integer.parseInt(searchArr[j])) {
					System.out.println("The Key is located at:"+j+" position");
					break;
				}
			}
		}
		

	}

}
