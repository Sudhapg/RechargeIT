package homeWork_Arrays;

import java.util.Arrays;

public class StaticandNonStaticMethods {
	
	String name;
	String email;
	String commitid;
	String awsid;
	int Kbascore;
	
	//This is the constructor
	StaticandNonStaticMethods(String name,String commitid,int Kbascore){
				
		this.name = name;//when the class name and the name passed in the parameters
		//are same then you have to identify it with the 'this' keyword
		this.commitid = commitid;
		this.Kbascore = Kbascore;
	};
	
	
	int add(int x,int y) {
		
		return x+y;
	}

	int add(int x,int y, int z) {
		return x+y+z;
	}
	
	//With the same class you create another constructor with different 
	//parameters. This is called polymorphism
	StaticandNonStaticMethods(String name,String commitid,String awsid){
				
		this.name = name;//when the class name and the name passed in the parameters
		//are same then you have to identify it with the 'this' keyword
		this.commitid = commitid;
		this.awsid = awsid;
	};
	
	public void printMe() {
		System.out.println(name);
		System.out.println(email);
		System.out.println(commitid);
		System.out.println(Kbascore);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		StaticandNonStaticMethods vernon = new StaticandNonStaticMethods("Vernon","ADVBN",100);
			
		vernon.name = "Vernon";
		vernon.email = "adfds";
		vernon.commitid = "ADVBN";
		vernon.Kbascore = 100;
		//vernon.printMe();
		
		StaticandNonStaticMethods claire = new StaticandNonStaticMethods("Claire","ADVBN",100);
		claire.name = "Claire";
		claire.email = "adfds";
		claire.commitid = "ADVBN";
		claire.Kbascore = 100;
		//claire.printMe();
		
		//This allows you to create 25 objects of StaticandNonStaticMethods
		StaticandNonStaticMethods[] sList = new StaticandNonStaticMethods[25];
	
		
		StaticandNonStaticMethods inst = new StaticandNonStaticMethods("Instructor1","ADFD","sfsf.dfs");
		sList[0] = claire;
		sList[1] = vernon; // you cannot have duplicate values here
		
		//You can print the object properties with the forloop
		for(int i=0;i<2;i++) {
			sList[i].printMe();
		}
		
		//System.out.println(Arrays.deepToString(sList));
	}

}
