package animalInheritance;

public class Dog extends Animal{
	
	
	String name;
	boolean isTrained;
	
	Dog(int numberOfLegs, boolean isPet,String name,boolean isTrained) {
		super(numberOfLegs, isPet);
		// TODO Auto-generated constructor stub
		this.name = name;
		this.isTrained = isTrained;
	}
	
	void walk() {
		System.out.println("Subclass:Dog only can walk forward!");
	}
	
	//We are overriding the original sound() method in the super class
	//This is an example for method overriding
	/*void sound() {
		System.out.println("Subclass:Since I am an animal, I can make sound! Dog barks!");
	}*/
	
	
		
}
