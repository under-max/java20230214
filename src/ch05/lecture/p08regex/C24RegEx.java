package ch05.lecture.p08regex;

public class C24RegEx {	
	public static void main(String[] args) {
		//한글
		//영소문자 [a-z]
		//영대문자 [A-Z]
		//한글 [가-힣]
		
		String pattern1 = "[가-힣]";
		System.out.println("산".matches(pattern1));
		System.out.println("a".matches(pattern1)); //알파벳이라 false
		System.out.println("3".matches(pattern1)); // 숫자라 false
		
		String pattern2 = "[가-힣]{2,}";
		System.out.println("두산".matches(pattern2));
		System.out.println("산".matches(pattern2)); //1글자라 false
		System.out.println("백두산".matches(pattern2)); 
	}
}
