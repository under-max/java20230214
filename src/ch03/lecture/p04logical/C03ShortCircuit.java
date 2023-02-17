package ch03.lecture.p04logical;

public class C03ShortCircuit {
	public static void main(String[] args) {
		//&&
		//ture and true = true
		//true and false = false 
		//false and true = false 
		//false and false = false
		//&&는 앞의 경우를 보고 false 면 뒤의 피연산자를 생략함 
		
		int x = 10; 
		if ((x++ > 0) && (x++ < 100)) {
			System.out.println("실행됨");
		}
		System.out.println(x); //12
		
		x = 10;
		if ((x++ > 0) && (x++ < 5)) {
			System.out.println("실행됨2");
		}
		System.out.println(x); //x=12
	
		x = 10;
		if ((x++ > 100) && (x++ < 200)) {
			System.out.println("실행됨3");
		}
		System.out.println(x); //11
		
		x = 10;
		if ((x++ > 100) && (x++ < 0)) {
			System.out.println("실행됨4");
		}
		System.out.println(x); //11
	}
}
