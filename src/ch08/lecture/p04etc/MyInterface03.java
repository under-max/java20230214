package ch08.lecture.p04etc;

public interface MyInterface03 {
	//static field
	
	public static final int I = 3; //자동 static 처리됨 interface에서는 인스턴스 필드를 가질수 없음 
	
	//public static final 생략
	int J = 5;
	String MY_HOME = "Seoul";
}
