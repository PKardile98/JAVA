package Map_interface;

import java.util.HashMap;

public class hash_map {

	public static void main(String[] args) {

		
		// Hash map is basically use to store the value in the pair with key and value
		
		HashMap<Integer, String> Map = new HashMap<Integer, String>();
		
		
		// Insertion of the element in the hash map.
		
		Map.put(101, "Pradeep");
		Map.put(102, "Prashant");
		Map.put(103, "Shubham");
		Map.put(104, "Abhi");
		Map.put(105, "Ruhi");
		Map.put(106, "Sonal");
		
		System.out.println(Map);
		
		// Search 
		
		System.out.println(Map.containsKey(102));
		
		// Get method 
		
		System.out.println(Map.get(109));
		
		// Iteration of the hash map 
		
		for (Object OB1: Map.keySet()) {
			
			System.out.println(OB1 +" "+Map.get(OB1));
		}
		
		
	}

}
