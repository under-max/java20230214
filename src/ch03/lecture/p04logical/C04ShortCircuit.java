package ch03.lecture.p04logical;

public class C04ShortCircuit {
	public static void main(String[] args) {
		// ||
		// true || true = true
		// true || false = true
		// false || true = true
		// false == false = false 
		
		int x = 10;
		
		if((x++ > 100) || (x++ < 0)) {
			System.out.println("실행됨1");
		}
		System.out.println(x); // false || false 두개 다 실행 x = 12
		
		x = 10;
		if((x++ > 100) || (x++ > 0)) {
			System.out.println("실행됨2"); 
		}
		System.out.println(x); // false || true 두개다 실행 x = 12

		x = 10;
		if((x++ > 0) || (x++ < 100)) {
			System.out.println("실행됨3");
		}
		System.out.println(x); // true || false 앞조건이 true 여서 바로 실행 x = 11

		x = 10;
		if((x++ > 0) || (x++ < -100)) {
			System.out.println("실행됨4");
		}
		System.out.println(x); //true || true 앞조건이 true 이므로 바로 실행 x = 11
	}
}
