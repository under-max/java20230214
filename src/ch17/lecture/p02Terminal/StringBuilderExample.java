package ch17.lecture.p02Terminal;

public class StringBuilderExample {
	public static void main(String[] args) {
		//StringBuilder vs String
		
		//StringBuilder 는 문자열 수정가능
		//String 문자열 수정 불가 
		
		String a = "java";
		String b = "html";
		
		String c = a + "Hello";
		String d = b + "Hello";
		
		StringBuilder e = new StringBuilder("Java");
		StringBuilder f = new StringBuilder("html");
		
		System.out.println(e);
		System.out.println(f);
		
		e.append("hello");
		f.append("hello");
		
		System.out.println(e);
		System.out.println(f);
		
	}
}
