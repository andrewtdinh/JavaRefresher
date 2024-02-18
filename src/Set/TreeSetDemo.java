package Set;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		
		ts.add(123);
		ts.add(27);
		ts.add(441);
		ts.add(111);
		ts.add(573);
		ts.add(389);
		
		System.out.println(ts);
		
		ts.remove(111);
		
		System.out.println(ts);
		
		System.out.println("Tree set contains 112? " + ts.contains(112));
		System.out.println("Tree set contains 27? " + ts.contains(27));
		
		System.out.println("Head set to 389 (exclusive): " + ts.headSet(389));
		System.out.println("Tail set from 389 (inclusive): " + ts.tailSet(389));
		System.out.println("Sub set from 123 (inclusive) to 441 (exclusive): " + ts.subSet(123, 441));
		System.out.println("Subset from 123 (inclusive) to 555 (not in set): " + ts.subSet(123, 555));
		System.out.println("Sub set from 26 (not in set) to 555 (not in set): " + ts.subSet(25, 555));
		
		ts.clear();
		
		System.out.println(ts);
	}

}
