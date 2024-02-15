package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List l1 = new ArrayList();
		
		l1.add(0, 12);
		l1.add(1, 14);
		
		List l2 = new ArrayList();
		l2.add(10);
		l2.add(11);
		l2.add(122);
		l2.add(135);
		l2.add(11);
		
		System.out.println(l1);
		
		l1.addAll(0, l2);
		
		System.out.println(l1);
		
		l1.remove(5);
		
		System.out.println(l1);
		
		System.out.println("Element at 5th index: " + l1.get(5));
		
		l1.set(5, 144);
		
		System.out.println(l1);
		
		l1.set(5, l2);
		
		System.out.println(l1);
		
		System.out.println(l1.indexOf(l2));
		System.out.println(l1.indexOf(135));
		System.out.println(l1.lastIndexOf(11));
		
		List l3 = l1.subList(4, 6);
		
		System.out.println(l3);
	} 

}
