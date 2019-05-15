package HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapBully2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> hmap = new HashMap<String,String>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		String string1 = input.nextLine();
		System.out.println("Enter the value of b:");
		String string2 = input.nextLine();
		System.out.println("Enter the value of c:");
		String string3 = input.nextLine();
		System.out.println("Enter the value of d:");
		String string4 = input.nextLine();
		
		hmap.put("a",string1);
		hmap.put("b",string2);
		hmap.put("c",string3);
		hmap.put("d",string4);
		
		hmap.remove("c");
		
		for (Map.Entry<String,String> entry :hmap.entrySet()) {
			if (entry.getKey()=="a") {
				String aValue = entry.getValue();
				hmap.replace("b",aValue);
			}
				
			System.out.println("Key="+entry.getKey()+", Value="+entry.getValue());
		}
		

	}

}
