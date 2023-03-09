package ch12.lecture.p01object;

public class C14HashCode {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		System.out.println(System.identityHashCode(o1));
		System.out.println(o1.hashCode());
		
		int h1 = o1.hashCode();
		int h2 = o1.hashCode();
		
		System.out.println(h1);
		System.out.println(h2);
	}
}
