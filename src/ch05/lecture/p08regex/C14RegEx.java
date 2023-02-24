package ch05.lecture.p08regex;

public class C14RegEx {
	public static void main(String[] args) {
		//1개 이상 {1,}
		//+
		
		String patter1 = "[a-z]{1,}";
		String patter2 = "[a-z]+";
		
		System.out.println("abc".matches(patter1));
		System.out.println("a".matches(patter1));
		System.out.println("A".matches(patter1)); //대문자 한개 이상 
		
		System.out.println("abc".matches(patter2));
		System.out.println("a".matches(patter2));
		System.out.println("A".matches(patter2)); //대문자 한개 이상 
		
		
	}
}
