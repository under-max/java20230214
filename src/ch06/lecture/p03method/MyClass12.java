package ch06.lecture.p03method;

public class MyClass12 {
	int method1() {
		
		return 3; ///1.메소드 종료 , 2.오른쪽 값을 호출한 곳으로 return(반환)
		//오른쪽 값은 메소드 리턴타입과 일치해야함
	}
	
	int method2() {
		//메소드에 리턴타입을 명시하면
		//해당타입의 값을 꼭 리턴해야함
		if(true) {
			return 3;
		}
		return 20;
	}
	
	int method3() {
		int a = 3;
		
		return a;
	}
	
//	int method4() {
//		
//		long a = 3L;
//		
//		return a; //형변환 안됨
//	}
	
	int method5() {
		short a = 6000;
		return a; //자동형변환
	}
	
	double method6() {
		double d = 3.14;
		
		return d;
	}
	
	double method7() {
		long l = 33;
		
		return l;//자동형변환
	}
	
	//리턴이 없으면 void 로 리턴타입을 명시
	
	
	void method8() {
		
		return;//만약 쓴다면 메소드 종료역활로만 사용 가능 
	}
}
