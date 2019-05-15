package animalInheritance;

public class Animal {
	
	int numberOfLegs;
	boolean isPet;
	
   Animal(int numberOfLegs,boolean isPet){
	   this.numberOfLegs = numberOfLegs;
	   this.isPet = isPet;
   }
	
   //If you dont want the child class to inherit the parent properties then you can 
   // call them static. Static can be access but cannot be overridden
  private static void sound(){
	  System.out.println("SuperClass:Since I am an animal, I can make sounds!"); 
   }
  
  public void getSound() {
	  sound();
  }
   
   void gotLife() {
	   System.out.println("SuperClass:I am an animal. I am alive");
   }
   
}
