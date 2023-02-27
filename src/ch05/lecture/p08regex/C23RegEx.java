package ch05.lecture.p08regex;

public class C23RegEx {
	// . (모든 문자열) 
	// \.  (.)
	
	public static void main(String[] args) {
		String pattern1 = "."; 
		String pattern2 = "\\.";
		
		System.out.println("a".matches(pattern1));
		System.out.println("a".matches(pattern2));
		
		System.out.println(".".matches(pattern1));
		System.out.println(".".matches(pattern2));
		
		//영문 대소문자 여러개 .com 으로 끝나는지 
		String pattern3 = "[a-zA-Z]+\\.com";
		System.out.println("daum.com".matches(pattern3));
		System.out.println("daum.net".matches(pattern3));//com이 아니라 false
		System.out.println("daumnet".matches(pattern3)); // .이 없어서 false
	}
}
