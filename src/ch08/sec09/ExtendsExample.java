package ch08.sec09;

public class ExtendsExample {
	public static void main(String[] args) {
		InterFaceCImp1 impl = new InterFaceCImp1();
		
		InterfaceA ia = impl;
		ia.methodA();
//		ia.methodB();//안됨
		System.out.println();
		
		InterfaceB ib = impl;
//		ib.methodA();
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}
	
}
