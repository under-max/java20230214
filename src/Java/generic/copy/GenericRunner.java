package Java.generic.copy;

public class GenericRunner {
	public static void main(String[] args) {
		MyCustomList<String> list = new MyCustomList<>();
		list.addElement("Element1");
		list.addElement("Element2");
		list.addElement("Element3");
		System.out.println(list);
		
		MyCustomList<Integer> list1 = new MyCustomList<>();
		list1.addElement(1234);
		list1.addElement(12);
		list1.addElement(124);
		System.out.println(list1);
	}
}
