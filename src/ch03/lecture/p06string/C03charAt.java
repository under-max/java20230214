package ch03.lecture.p06string;

public class C03charAt {
	public static void main(String[] args) {
		//charAt
		// 특정위치(index)에 있는 문자 확인 
		// return type = char type
		
		String str1 = "spring";
		System.out.println("길이" + str1.length());
		System.out.println("위치" + str1.charAt(0)); // 파이썬에서 일반 String name = "jhon 에서 name[0] 느낌 
		char a = str1.charAt(2);
		System.out.println(2);
		System.out.println(str1.charAt(str1.length()-1));
		
		
		
	}
}
