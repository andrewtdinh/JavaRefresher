package Map;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		
		lhm.put("Andrew", 49);
		lhm.put("Andy", 19);
		lhm.put("Steven", 29);
		lhm.put("Yahuoo", 74);
		lhm.put("Phuong", 35);
		lhm.put("Thanh", 3);
		lhm.putIfAbsent("Andys", 19);
		
		System.out.println(lhm);
		System.out.println("Size of hashmap: " + lhm.size());
		
		if (lhm.containsKey("Phuong")) {
			System.out.println("Phuong's age is: " + lhm.get("Phuong"));
		}
		
		System.out.println("HashMap contains 74: " + lhm.containsValue(74));
		
		System.out.println("Size of HashMap is: " + lhm.size());
		
		lhm.clear();
		
		System.out.println("Is HashMap empty? " + lhm.isEmpty());


	}

}
