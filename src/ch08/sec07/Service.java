package ch08.sec07;

public interface Service {
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속코드");
		defaultcommon();
	}
	
	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속코드");
		defaultcommon();
	}
	
	private void defaultcommon() {
		System.out.println("defaultMethod 중복코드A");
		System.out.println("defaultMethod 중복코드B");
	}
	
	static void staticMethod1() {
		System.out.println("staticMethod1 종속코드");
		staticCommon();
	}
	
	static void staticMethod2() {
		System.out.println("staticMethod2 종속코드");
		staticCommon();
	}
	
	private static void staticCommon() {
		System.out.println("staticMethod 중복코드 C");
		System.out.println("staticMethod 중복코드 D");
	}
}
