package day10Java;

import java.util.Arrays;

public class forloopforobjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Fish";
		String b = "Horse";
		String c = "Dog";
		
		String d = a+b+c;
		
		String[] str= {a,b,c};
		
		System.out.println(Arrays.toString(str));
		for (String s: str) {
			System.out.println(s);
		}
		

	}

}
