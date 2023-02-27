package ch05.lecture.p08regex;

public class C19RegEx {
	public static void main(String[] args) {
		//whitespace character 빈칸
		//\s
		
		String pattern1 = "\\s";
		System.out.println(" ".matches(pattern1));
		System.out.println("\n".matches(pattern1));
		System.out.println("\t".matches(pattern1));
		
		//소문자 단어 3개로 이루어져 있는지 
		String pattern2 = "\\s*[a-z]+\\s[a-z]+\\s[a-z]+\\s*"; //*0개이상, 1개이상, ?0혹은1
		System.out.println("hellow world java".matches(pattern2));
		System.out.println("hellow world".matches(pattern2)); //false
		System.out.println("    hellow world java".matches(pattern2)); //
	}
}
