package ch09.sec04.exam03;

public class A {
	public void method1(int arg) { //final int arg
		int var = 1; //final int var;
		
		//로컬 클래스
		
		class B {
			void method2() {
				System.out.println("arg: " + arg);
				System.out.println("var: " + var);
			}
		}
		
		B b = new B();
		b.method2();
		
//		arg = 3; //x
//		var = 3; // x 
	}
	
}
