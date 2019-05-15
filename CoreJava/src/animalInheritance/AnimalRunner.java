package animalInheritance;

public class AnimalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a1 = new Animal(4,false);
		
		a1.getSound();
		a1.gotLife();
		
		//This is allowed. but you cannot access the methods in dog class
		// as we are instantiating the Animal constructor
		//Animal dog1 = new Dog(4,true,"Biscuit",false);
		
		Dog dog1 = new Dog(4,true,"Biscuit",false);
		System.out.println("Dog:");
		dog1.walk();
		dog1.getSound();
		dog1.gotLife();
		
		Cat cat1 = new Cat(4,true,true);
		System.out.println("Cat:");
		cat1.catchMouse();
		cat1.gotLife();
		cat1.getSound();
		
		
	}

}
