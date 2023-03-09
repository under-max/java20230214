package ch13.example.exam02;

public class C04GenericType {
	public static void main(String[] args) {
		MyClass04<String, Integer> o1 = new MyClass04<>();
		o1.setItem("Hello");
		o1.setItem2(99);
		
		String s1 = o1.getItem();
		int s2 = o1.getItem2();
		
		System.out.println(s1 + " " + s2);
		
		MyClass04<String, String> o2 = new MyClass04<>();
		MyClass04<Integer, String> o3 = new MyClass04<>();
		
		
	}
}

class MyClass04<T, U> {
	private T item;
	private U item2;
	
	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
	public U getItem2() {
		return item2;
	}
	public void setItem2(U item2) {
		this.item2 = item2;
	}
	
	
}
