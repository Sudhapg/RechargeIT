package HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> hmap1 = new HashMap<Integer,String>();
		//Adding some values to the hashmap
		hmap1.put(1, "NY");
		hmap1.put(2,"NJ");
		hmap1.put(3,"CA");
		hmap1.put(3,"PA");
		hmap1.put(null,"MI");
		hmap1.put(4,null);
		hmap1.put(200,"SD");
		
		HashMap<Integer,String> hmap2 = new HashMap<Integer,String>();
		hmap1.put(999, "PQ");
		hmap1.put(1000, "QR");
		
		System.out.println(hmap1.containsValue("MI"));//searching for a value in hashmap
		System.out.println(hmap1.containsKey(null)); // searching for a key in hashmap
		System.out.println(hmap1.get(200).hashCode());// gives the hashcode for that key
		System.out.println(hmap1.replace(2,"XY"));//replace the the value of key 2 with "XY"
		System.out.println(hmap1.remove(2));// remove the value with key 2
		
		//copying from one hash map into another
		hmap1.putAll(hmap2);
		hmap2.putAll(hmap1);
		
		//Another way to print the key and values of hashmap
		//Map.Entry is the datatype used here
		for(Map.Entry<Integer,String> entry: hmap1.entrySet())
			System.out.println("Key="+entry.getKey()+", Value="+ entry.getValue());
		
		//One way to print the key and values of hash map
		System.out.println(hmap2.keySet());
		System.out.println((hmap2.values()));
		
		
		
		LinkedHashMap<Integer,String> lmap1 = new LinkedHashMap<Integer, String>();
		
		lmap1.put(1,"NY");
		lmap1.put(2,"NJ");
		lmap1.put(3,"CA");
		lmap1.put(3,"PA");
		lmap1.put(null,"MI");
		lmap1.put(4,null);
		lmap1.put(200,"SD");
		
		//map2
		LinkedHashMap<Integer,String> lmap2 = new LinkedHashMap<Integer, String>(16, .75f,true);
		lmap2.put(999, "PQ");
		lmap2.put(1000,"QR");
		
		//adding map into a map
		lmap1.putAll(lmap2);
		
		//Adds the key 201 if it is not already present
		
		System.out.println(lmap1.putIfAbsent(201,"AB"));
		
		for(Map.Entry<Integer,String> entry: lmap1.entrySet())
			System.out.println("Key="+entry.getKey()+", Value="+ entry.getValue());
		
		
		
		//LinkedHashmap access order
		
LinkedHashMap<Integer,String> lmap1Access = new LinkedHashMap<Integer, String>(16,.75f,true);
		
		lmap1Access.put(1,"NY");
		lmap1Access.put(2,"NJ");
		lmap1Access.put(3,"CA");
		lmap1Access.put(3,"PA");
		lmap1Access.put(null,"MI");
		lmap1Access.put(4,null);
		lmap1Access.put(200,"SD");
		lmap1Access.put(100,"YZ");
		
		//map2
		LinkedHashMap<Integer,String> lmap2Access = new LinkedHashMap<Integer, String>(16, .75f,true);
		lmap2Access.put(999, "PQ");
		lmap2Access.put(1000,"QR");
		
		//adding map into a map
		lmap1Access.putAll(lmap2Access);
		
		//Adds the key 201 if it is not already present
		
		System.out.println(lmap1Access.putIfAbsent(201,"AB"));
		
		//Accessing elements
		lmap1Access.get(100);
		lmap1Access.get(100);
		lmap1Access.get(1000);
		lmap1Access.get(999);
		
		//printing all entries for LinkedHashMap
		System.out.println("-------All entries LinkedHashMap - Access Order---------");
		
		for(Map.Entry<Integer,String> entry: lmap1Access.entrySet())
			System.out.println("Key="+entry.getKey()+", Value="+ entry.getValue());
		
		
	}

}
