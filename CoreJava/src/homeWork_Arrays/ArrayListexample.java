package homeWork_Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayListexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List xyz = new ArrayList<>(5);
		
		xyz.add(1.5);
		xyz.add("String");
		System.out.println(xyz.size());
		
		List<String> students = new ArrayList<String>(5);
		
		students.add("Vernon");
		students.add("Lucy");
		students.add("Lucy");//Accepts duplicates
		//students.add('a');
		//students.add(2.5);
		//students.add(5);
		
		students.remove("Lucy");
		System.out.println(students.size());
		System.out.println(students);
		
		students.add(0,"Nilda");
		System.out.println(students);
		
		students.add(1,"Shahparan");
		System.out.println(students);
		
		System.out.println(students.get(0));//Getting the element by giving the index
		System.out.println(students.indexOf("Nilda"));//Getting the index by giving the value of the element
		
		System.out.println(students.contains("shahparan"));
		
		System.out.println(students.lastIndexOf("Shahparan"));//gives the last index of the element if it has duplicate values
		
		System.out.println(students.set(1, "Marcial"));//Replaces the element in index 1 with the value Marcial
		System.out.println(students);
	
		//List to array conversion
		String[] arr = new String[students.size()];
		System.out.println(students.toArray(arr));
		System.out.println("Array:"+Arrays.toString(arr));
	
		//Array to List conversion
		List<String> newList= new ArrayList<>();
		newList = Arrays.asList(arr);
		System.out.println("Array to List:"+ newList);
		
		//List is only for objects, not for primitives
		Integer[] numbers = {1,2,3,4,5};
		List<Integer> numList = new ArrayList<>();
		numList = Arrays.asList(numbers);
		System.out.println("int to List:"+numList);
		
		int x = 5;
		Integer y = 5;
		char a = 'a';
		Character b = a;
		
		a=b;
		
		//Wrapper class -> Primitive ==> un-boxing
		//Primitive -> Wrapper Class ==> boxing
		
		//Removing all elements
		//students.clear();
		//System.out.println(students);
		
		//Print all elements using Lambda exp.
		students.forEach(p -> {System.out.println(p);});
		
		//Add list ins to students list
		List<String> ins = new ArrayList<>();
		ins.add("Shah");
		ins.add("Young");
		
		students.addAll(ins);
		System.out.println(students);
		
		//generic but can add all types of object
		List<Object> rIT = new ArrayList<>();
		rIT.add(2);
		rIT.add("String");
		
		//List pqr = new ArrayList();
		
		
	}
	
	

}
