package HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FoodToppingsMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> hmap = new HashMap<String,String>();
		HashMap<String,String> hmap2 = new HashMap<String,String>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the key value");
		String keyvalue1 = input.nextLine();
		System.out.println("Enter the value for the key");
		String value1 = input.nextLine();
		
		String icecreamvalue = "cherry";
		String flag = "false";
		
		hmap.put(keyvalue1, value1);
		
		for (Map.Entry<String,String> entry: hmap.entrySet()) {
			if (entry.getKey().equals("ice cream") && 
					!entry.getValue().equals("cherry")){
				//hmap2.put("ice cream", "cherry");
				flag = "true";
			}
			
			
			
		}
		if(flag == "true") {
			hmap.replace("ice cream","cherry");
		}
		if(!hmap.containsKey("bread")) {
			
			if(hmap.get("bread") != "butter") {
				hmap.put("bread", "butter");
			}
		}else {
			hmap.remove("bread");
		}
		
		System.out.println(hmap.keySet());
		System.out.println(hmap.values());
		
	}

}
