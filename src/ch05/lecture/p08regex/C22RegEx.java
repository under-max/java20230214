package ch05.lecture.p08regex;

public class C22RegEx {
	public static void main(String[] args) {
		//모든문자
		//.
		
		String pattern1 = ".";
		
		System.out.println("a".matches(pattern1));
		System.out.println("Z".matches(pattern1));
		System.out.println(" ".matches(pattern1));
		System.out.println("\n".matches(pattern1)); //엔터는 아니네 
		System.out.println("\t".matches(pattern1)); 
		System.out.println("\s".matches(pattern1)); 
		
		String pattern2 = ".{3}"; //어떤 문자든지 3개로 이루어짐
		System.out.println("가나다".matches(pattern2));
		System.out.println("   ".matches(pattern2));
		System.out.println("가 a".matches(pattern2));
		
		
	}
}
