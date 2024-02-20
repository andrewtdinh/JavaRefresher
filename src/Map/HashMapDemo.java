package Map;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("Andrew", 49);
		hm.put("Andy", 19);
		hm.put("Steven", 29);
		hm.put("Yahuoo", 74);
		hm.put("Phuong", 35);
		hm.put("Thanh", 3);
		
		System.out.println(hm);
		
		if (hm.containsKey("Phuong")) {
			System.out.println("Phuong's age is: " + hm.get("Phuong"));
		}
		
		System.out.println("Size of HashMap is: " + hm.size());
		
		hm.clear();
		
		System.out.println("Is HashMap empty? " + hm.isEmpty());

	}

}
