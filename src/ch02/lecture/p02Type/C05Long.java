package ch02.lecture.p02Type;

public class C05Long {
	public static void main(String[] args) {
		//long -> 8bytes -> 64bites 
		
		long l1 = 3000000000L; //java 에서 쓴값은 integer 로 인식함 때문에 범위 오류 숫자 뒤에 대문자 L 사용
		l1 = 9998277341974192L;
		l1 = -999929837972592L;
		
		l1 = 9_998_277_341_974_192L;
		l1 = -999_929_837_972_592L;
	}
}
