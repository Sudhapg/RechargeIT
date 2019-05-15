package treeMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer,String> tmap1 = new TreeMap<Integer,String>();
		//Adding some values to the treemap
		tmap1.put(1, "NY");
		tmap1.put(2,"NJ");
		tmap1.put(3,"CA");
		tmap1.put(3,"PA");
		//tmap1.put(null,"MI");//You cannot have null values in treemap
		//tmap1.put(4,null);
		tmap1.put(200,"SD");
		
		TreeMap<Integer,String> tmap2 = new TreeMap<Integer,String>();
		tmap1.put(999, "PQ");
		tmap1.put(1000, "QR");
		
		/*
		 * System.out.println(tmap1.containsValue("MI"));//searching for a value in
		 * hashmap System.out.println(tmap1.containsKey(null)); // searching for a key
		 * in hashmap System.out.println(tmap1.get(200).hashCode());// gives the
		 * hashcode for that key System.out.println(tmap1.replace(2,"XY"));//replace the
		 * the value of key 2 with "XY" System.out.println(tmap1.remove(2));// remove
		 * the value with key 2
		 */		
		//copying from one tree map into another
		tmap1.putAll(tmap2);
		tmap2.putAll(tmap1);
		
		System.out.println(tmap1.putIfAbsent(201,"AB"));
		
		//Creates a new tree map sorted in descending order
		Map<Integer,String> newMap = new TreeMap<>(Collections.reverseOrder());
		newMap.putAll(tmap1);
		//Another way to print the key and values of treemap
		//Map.Entry is the datatype used here
		for(Map.Entry<Integer,String> entry: tmap1.entrySet())
			System.out.println("Key="+entry.getKey()+", Value="+ entry.getValue());
		
		System.out.println("-------Treemap in reverse order -------");
		//Print the reverseorder tree map
		for(Map.Entry<Integer,String> entry: newMap.entrySet())
			System.out.println("Key="+entry.getKey()+", Value="+ entry.getValue());
		
		//One way to print the key and values of hash map
		System.out.println(tmap2.keySet());
		System.out.println((tmap2.values()));
		
		
		
		
	}

}
