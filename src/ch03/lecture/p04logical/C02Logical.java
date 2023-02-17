package ch03.lecture.p04logical;

public class C02Logical {
	public static void main(String[] args) {
		//^ (xor : exclusive or 베타적 논리합)
		//양립할수 없는
		//피 연산자가 다르면 결과가 true 같으면 false
		
		System.out.println(true ^ true); //false 
		System.out.println(true ^ false); //true
		System.out.println(false ^ true); //true
		System.out.println(false ^ false); //false
		
		System.out.println("-------------------------");
		// & (and) 
		// 피 연산자가 모두 true 이면 true 나머지 false
		System.out.println(true & true); //true 
		System.out.println(true & false); //false
		System.out.println(false & true); //false
		System.out.println(false & false); //false
		
		System.out.println("-------------------------");
		// | (or) 
		//피연산자가 모두 false 면 false 
		// 나머지는 true
		System.out.println(true | true); //true 
		System.out.println(true | false); //true
		System.out.println(false | true); //true
		System.out.println(false | false); //false
	}
}
