package ch02.lecture.p01variable;

import java.util.Iterator;

public class C01Variable {
	
	public static void main(String[] args) {
		//변수
		//값을 담을수 있는 이름있는 공간 
		
		//변수 선언 
		//타입 변수 명 
		int age = 1;
		int average = 1;
		System.out.println(age + average);
		//변수 명 
//		영문 대소문자 _ $ 조합으로 작성 가능 숫자로 시작하면 안됨, _가 제일 앞에 있어도 안됨 
//		lowerCarmelCase 관습
		int $ = 0;
		int a_= 0;
		int hello =0;
		int your_age=0; //관습에 따라 쓸것 yourAge 
		int 나이=0; //사용하지 말것 권장하지 않음 
//		System.out.println($,a_,hello);
		
		//변수 여러개 선언 가능 
		int myAge=0, hisAge=0, herAge=0;
		
		//같은 이름의 변수 선언 불가 
		int hi=0; 
//		float hi;
		
//		변수에 값 대입(할당) : =
		hi = 3;
		int val1;
		val1 = 99;
//		변수 선언 값대입 동시에 할 수 있다 
		int val2 = 100;
		//여러개 가능 
		int val3 = 20, var4 = 40;
		
		//값을 할당하지 않은 변수 사용 불가 
		//초기화 하지 않은 변수 사용 불가능 
//		System.out.println("$"); 초기화 하지 않았다고 오류남 initialize
		//변수명 작성시 어떤 값을 갖는지 알아 볼 수 있게 작성 
		
		int koreanScore=0;
		int ks=0; //XXX
		int englistScore=0;
	}
	
	
}
