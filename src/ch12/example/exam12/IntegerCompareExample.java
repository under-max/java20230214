package ch12.example.exam12;

public class IntegerCompareExample {
	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 100;
		Integer obj4 = 100;
		
//		System.out.println(obj1 == obj2);
//		System.out.println(obj3 == obj4);
		
		System.out.println(obj1.equals(obj2));
		System.out.println(obj3.equals(obj4));
	}
}
