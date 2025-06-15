package collectios_example;

import java.util.HashMap;
import java.util.Map;

public class MapsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Map<String, String> Ministers = new HashMap<>();
		
		Ministers.put("FM", "Niramala");
		Ministers.put("HM", "Amit");
		Ministers.put("PM", "Modi");
		
		System.out.println(Ministers);
		
		
		// fetch data from Map
		System.out.println("FM is " + Ministers.get("FM"));
		
		// remove the data from map
		Ministers.remove("HM");
		System.out.println(Ministers);
		
		// Update the data in map
		Ministers.put("FM", "New FM Name");
		System.out.println(Ministers);
		
		// Print all the keys in Map
		System.out.println(Ministers.keySet());
		
		if(Ministers.keySet().contains("HM")) {
			System.out.println("HM is present");
		}else {
			System.out.println("HM is not present");
		}
		
		// Iterate through the map
		
		Ministers.put("HM", "Amit");
		
		for(String Mn: Ministers.keySet()) {
			
			System.out.println("Ministery is " + Mn);
			System.out.println("Minister name is " + Ministers.get(Mn));
			
		}

	}

}
