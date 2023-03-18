package Java.collectionsss;

import java.util.*;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		
		list1.add(new Integer(5));
		list1.add(new Integer(1));
		list1.add(new Integer(7));
		list1.add(new Integer(21));
		list1.add(new Integer(4));
		list1.add(new Integer(9));
		
		ArrayList list2 = new ArrayList(list1.subList(0, 3));
		System.out.println(list2);
	}
}
