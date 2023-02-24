package ch05.lecture.p08regex;

public class C12RegEx {
	public static void main(String[] args) {
		//수량 3,7 {3,7}
		
		String pattern = "a{1,3}";
		
		System.out.println("a".matches(pattern));
		System.out.println("aa".matches(pattern));
		System.out.println("aaa".matches(pattern));
		System.out.println("".matches(pattern));
		System.out.println("aaaa".matches(pattern));
		System.out.println("abc".matches(pattern));
		
	}
}
