package animalInheritance;

public class Cat extends Animal{
	boolean canClimb;
	
	Cat(int numberOfLegs, boolean isPet,boolean canClimb){
		super(numberOfLegs,isPet);
		this.canClimb = canClimb;
	}
	
	void sound() {
		//System.out.println("Cat");
		System.out.println("Cat Subclass: I can mke sound! Meow!");
	}

	void catchMouse() {
		System.out.println("Cat Sub-class: Cat can catch mice");
	}
	
	
}
