package interfaceActivity;
import java.util.ArrayList;
import java.util.List;

public class ConcreteClass implements MyInterface, YourInterface {

	
	public void sayHello() {
		System.out.println("Hi");
		//This is how we use the variables initialized in the 
		//Interface. This value cannot be changed as it is final
		System.out.println("I am from "+MyInterface.companyName);
	}
	
	public void shakeHand() {
		// TODO Auto-generated method stub
		System.out.println("Shake hand!");
	}
	
	public void letsChat() {
		// TODO Auto-generated method stub
		System.out.println("Lets Chat !!");
	}
	
	public static void main(String[] args) {
		
		//instantiating the ConcreteClass
		ConcreteClass concreteClass = new ConcreteClass();
		
		concreteClass.sayHello();
		concreteClass.shakeHand();
		concreteClass.letsChat();
		
		
				
		
	}


	

	

}
