package ListInterface;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(12);
		list.add(22);
		list.add(32);
		list.add(64);
		
		System.out.println(list);
		
		list.remove(2);
		
		System.out.println(list);
		System.out.println(list.get(2));
	}
}
