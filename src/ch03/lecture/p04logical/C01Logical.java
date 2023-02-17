package ch03.lecture.p04logical;

public class C01Logical {
	public static void main(String[] args) {
		//논리연산자
		//&& || !
		// ^, &, |
		//피연산자: boolean 
		//연산결과: boolean
		
		//&&(and) : 양변이 모두 true 일때만 결과 true 나머지는 false 
		System.out.println(true && true); //true
		System.out.println(true && false); //false
		System.out.println(false && true); //false
		System.out.println(false && false); //false
		
		//||(or) : 두항이 모두 false 일때만 false고 나머지는 true 
		System.out.println(true || true); //true
		System.out.println(true || false); //true
		System.out.println(false || true); //true
		System.out.println(false || false); //false
		
		// !(not): 논리부정형? 하나의 피연산자 
		// 피연산자가 false 면 결과는 true 
		// 피연산자가 true 면 결과는 false 
		System.out.println(!false); //true
		System.out.println(!true); //false 
	}
}
