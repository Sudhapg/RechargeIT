package homeWork_Arrays;

public class ReversingStringusingStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Reverse me";
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		sb = sb.reverse();//Reversing the string using reverse method
		System.out.println(sb.toString());
		
		//Reversing the string using for loop and not using the reverse function
		for(int i=str.length()-1;i>10;i--) {
			sb.append(str.charAt(i));
		}
		
		System.out.println(sb.toString());
		
		String str1 = "Reverse me";
		StringBuilder sb1 = new StringBuilder(str1);
		//sb1 = sb1.setCharAt(2,'m');
	}

}
