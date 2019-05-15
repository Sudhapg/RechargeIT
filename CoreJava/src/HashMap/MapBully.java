package HashMap;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class MapBully {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> hmap = new HashMap<String,String>();
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the value for a:");
		String string1= input.nextLine();
		System.out.println("Please enter the value for b:");
		String string2 = input.nextLine();
		System.out.println("Please enter the value for c:");
		String string3 = input.nextLine();
		hmap.put("a",string1);
		hmap.put("b",string2);
		hmap.put("c",string3);
		
		for (Map.Entry<String,String> entry: hmap.entrySet())
		{
			if (entry.getKey()=="a" && entry.getValue() != "") {
				String aValue = entry.getValue();
				hmap.replace("a","");
				hmap.replace("b",aValue);
			}
			System.out.println("Key = "+entry.getKey()+ ", Value = "+entry.getValue());
			
		}
	}

}
