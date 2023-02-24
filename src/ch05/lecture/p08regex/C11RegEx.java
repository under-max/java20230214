package ch05.lecture.p08regex;

public class C11RegEx {
	public static void main(String[] args) {
		//010으로 시작 하고, -기호, 숫자 4개, -기호, 숫자 4개로 이루어진 패턴인가? 
		
		System.out.println("010-9999-7777".matches("[0-9]{3}[-][0-9]{4}[-][0-9]{4}"));//true
		System.out.println("010-9876-7654".matches("[0-9]{3}[-][0-9]{4}[-][0-9]{4}"));//true
		System.out.println("010-98767654".matches("[0-9]{3}[-][0-9]{4}[-][0-9]{4}")); //false
		System.out.println("010-9876-654".matches("[0-9]{3}[-][0-9]{4}[-][0-9]{4}"));//false
		
		System.out.println("ad".matches("[^0-9]{2}"));
		
		System.out.println("02-134-4567".matches("^[0-9]{2,3}[-][0-9]{3,4}[-][0-9]{4}$"));
		System.out.println("010-1304-4567".matches("^[0-9]{2,3}[-][0-9]{3,4}[-][0-9]{4}$"));
		System.out.println("031-134-4567".matches("^[0-9]{2,3}[-][0-9]{3,4}[-][0-9]{4}$"));
		
		System.out.println("absdgf23465@naver.com".matches("^[0-9a-zA-Z]{1,12}[@]{1}[a-zA-Z]{1,9}[.]{1}[a-zA-Z]{3}$"));
	}
}
