package ch07.lecture.p01inheritance;

public class C06Polymophism { //생물학에서 빌려온단어 
	public static void main(String[] args) {
		Sub06 o1 = new Sub06();
		
		Super06 o2 = o1; //가능
		
		Super06 o3 = new Sub06();
		
//		Sub06 o4 = new Super06();//는 에러
		
		
	}
}
