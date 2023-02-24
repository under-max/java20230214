package ch05.lecture.p08regex;

public class C07RegEx {
	public static void main(String[] args) {
		System.out.println("a".matches("[a-zA-Z]"));
		System.out.println("b".matches("[a-zA-Z]"));
		System.out.println("c".matches("[a-zA-Z]"));
		System.out.println("d".matches("[a-zA-Z]"));
		System.out.println("E".matches("[a-zA-Z]"));
		System.out.println("F".matches("[a-zA-Z]"));
		
		
		System.out.println("0".matches("[a-zA-Z]"));
		System.out.println("1".matches("[a-zA-Z]"));
		System.out.println("9".matches("[a-zA-Z]"));
		
		System.out.println("0".matches("[0-9]"));
		System.out.println("1".matches("[0-9]"));
		System.out.println("9".matches("[0-9]"));
		
		
	}
}
