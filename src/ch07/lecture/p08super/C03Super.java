package ch07.lecture.p08super;

public class C03Super {

}

class Super03 {
	
	Super03(int i){
		
	}
}

class Sub03 extends Super03 {
	Sub03(){
//		super(); 자동으로 삽입되는 상위클래스 기본생성자 호출 코드 
//		는 동작하지 않는다
		super(3);
	}
}