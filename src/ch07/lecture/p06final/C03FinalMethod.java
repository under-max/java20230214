package ch07.lecture.p06final;

public class C03FinalMethod {

}

//final method
//하위 클래스에서 재정의 불가
class Super03 {
	public final void method1() {
		
	}
	public void method2() {
		
	}
}

class Sub03 extends Super03{
	@Override
	public void method1() {
		System.out.println("재정의");
	}
	
	
}