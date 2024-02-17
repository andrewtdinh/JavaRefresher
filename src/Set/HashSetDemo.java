package Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add("Andrew");
		hs.add("is");
		hs.add("not");
		hs.add("the ");
		hs.add("king");
		hs.add("of");
		hs.add("Andrew");
		
		System.out.println(hs);
		
		hs.remove("of");
		
		System.out.println(hs);
		
		System.out.println("Does set contain king? "+ hs.contains("king"));
		System.out.println("Does set contain 'of'? " + hs.contains("of"));
		
		Iterator it = hs.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		hs.clear();
		System.out.println(hs);
	}

}
