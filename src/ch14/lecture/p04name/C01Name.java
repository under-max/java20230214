package ch14.lecture.p04name;

public class C01Name {
	public static void main(String[] args) {
		//현재쓰레드 객체얻기
		Thread t1 = Thread.currentThread(); //call static method 
		
		//쓰레드 이름 얻기
		System.out.println(t1.getName()); //jvm이 이름 지어줌 메인쓰레드의 기본이름 main
		
		//쓰레드 이름 바꾸기 
		t1.setName("메인쓰레드");
		
		System.out.println(t1.getName());
		
	}
}
