package ch03.lecture.p06string;

public class C02Length {
	public static void main(String[] args) {
		//length 
		//문자열의 길이를 확인할 때 사용하는 메소드 
		//리턴타입 int
		
		String str1 = "java";
		String str2 = "spring";
		String str3 = "hellow world";
		String str4 = """
				동해물과 백두산이
				마르고 닳도록
				""";
		
		int len1 = str1.length();
		System.out.println(len1);
		System.out.println(str2.length());
		System.out.println(str3.length());
		System.out.println(str4.length()); //첫번쨰 엔터 빼고 그뒤의 enter는 문자길이 합계됨 
		
	}
}
