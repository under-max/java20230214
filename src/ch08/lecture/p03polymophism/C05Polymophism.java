package ch08.lecture.p03polymophism;

public class C05Polymophism {
	public static void main(String[] args) {
		String s1 = "Hello world";
		StringBuilder s2 = new StringBuilder("World");
		
		String s3 = s1.replace(s2, "java");
		System.out.println(s3);
	}
}
