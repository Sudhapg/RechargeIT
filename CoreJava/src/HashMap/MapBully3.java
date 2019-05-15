package HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapBully3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> hmap = new HashMap<String,String>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the key value");
		String keyvalue1 = input.nextLine();
		System.out.println("Enter the Value for the key");
		String value1 = input.nextLine();
		System.out.println("Enter the key value");
		String keyvalue2 = input.nextLine();
		System.out.println("Enter the value for the key");
		String value2 = input.nextLine();
		input.close();
		
		hmap.put(keyvalue1,value1);
		hmap.put(keyvalue2,value2);
		String aValue="";
		String bValue="";
		
		
		for(Map.Entry<String,String> entry: hmap.entrySet()) {
			//System.out.println("inside for loop");
			
			if(entry.getKey().equals("a")) {
				aValue = entry.getValue();
			}
			if(entry.getKey().equals("b")) {
				bValue = entry.getValue();
			}
			
			//hmap.put("ab",aValue+bValue);
			
			//System.out.println("Key Value = "+entry.getKey()+", Value = "+entry.getValue());
		}
		if(hmap.containsKey("a") && hmap.containsKey("b")){
		hmap.put("ab",aValue+bValue);
	}
		
		System.out.println(hmap.keySet());
		System.out.println(hmap.values());
		

	}

}
