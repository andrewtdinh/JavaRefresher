package ListInterface;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		int[] array = {36, 48, 60};
		
		
		list.add(12);
		list.add(24);
		list.add("hello");
		list.add("there");
		list.add(array[0]);
		
		System.out.println(list);
		list.addLast("Dinh");
		
		System.out.println(list);

	}

}
