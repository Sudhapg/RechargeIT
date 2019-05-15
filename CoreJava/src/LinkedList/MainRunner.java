package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;



public class MainRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal dog1 = new Animal("Tom",4);
		Animal dog2 = new Animal("Biscuit",4);
		Animal dog3 = new Animal("Cookies",4);
		Animal dog4 = new Animal("Cookies",4);
		Animal dog5 = new Animal("Biscuit",4);
		
		ArrayList<Animal> dogList = new ArrayList<Animal>(Arrays.asList(dog1,dog2,dog3,dog4,dog5));
		
		//Animal[] ShahsPet1 = {dog2,dog2};
		
		ArrayList<Animal> shahsPet = new ArrayList<Animal>(Arrays.asList(dog2,dog3,dog4));
		
		for (Animal animal: shahsPet) {
			System.out.println(animal.name);
	}
		String animalName = "Cookies";
		
		Animal animal = null;
		
		//Create another list and add the result to the new list
		ArrayList<Animal> aList = new ArrayList<>();
		
		
		//Adding the dog "cookies" to the list
		for(int i = 0;i<shahsPet.size();i++) {
			if(!shahsPet.get(i).name.equals(animalName)) {
				continue;
				}else {
						//animal = shahsPet.get(i);
						aList.add(shahsPet.get(i));//
					//System.out.println("Dog found with name:"+ aList.size());
				}
		}
		
		System.out.println("No. of Dog found with name" +animalName+" is: "+aList.size());
	
	for(int i=shahsPet.size()-1;i>=0;i--) {
		if(!shahsPet.get(i).name.equals(animalName)) {
			continue;
		}else {
			shahsPet.remove(shahsPet.get(i));
			//System.out.println("Size before removal:"+shahsPet.size());
		}
	}
	
	System.out.println("No. of shahsPet:"+shahsPet.size());
	
	System.out.println("Here are our available dogs:");
	
	ArrayList<Animal> distinct = new ArrayList<Animal>();
	
	/*for(int i = 0;i<shahsPet.size();i++) {
		for(int j=0;j<distinct.size();j++) {
			if(!dogList.get(i).name.equals(distinct.get(j).name)) {
				distinct.add(dogList.get(i));
			}
		}
		
	}*/
	
	for(Animal shahslist: shahsPet) {
		System.out.println(shahslist.name);
	}
	
	boolean flag = true;
	for(int i = 0;i<dogList.size();i++) {
		flag = true;
		for(int j=0;j<distinct.size();j++) {
		//int j = 0;
			//System.out.println("dogList"+dogList.get(i).name);
		if ((dogList.get(i).name)== (distinct.get(j).name)){
			flag = false;
			//continue;
		}//else {flag = true;}
			//j++;
		}
		if (flag == true) {
			distinct.add(dogList.get(i));
		}
		}
	
	System.out.println("Size of distinct list:"+distinct.size());
	for (Animal disdog: distinct) {
		System.out.println(disdog.name);
	}
	
	
	//String dogname = "";
	//for(Animal dog: dogList) {
	//	List<Animal> listDistinct = dogList.stream().distinct().collect(Collectors.toList());
	//	System.out.println(dog.name);
	//}
		
	}
	

}
