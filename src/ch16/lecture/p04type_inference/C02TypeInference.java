package ch16.lecture.p04type_inference;

import java.util.*;

public class C02TypeInference {
//	지역변수만 가능 
//	var field = 3;
	public static void main(String[] args) {
		// 지역변수(lvtype) 타입 추론
		// var 사용
		// 선언과 동시에 초기화 할떄만 사용
		int a = 3;
		String b = "Java";

		var c = 5;
		var d = "Hello";
		
//		var e;
//		e = 9; 안됨
		
		Box<String> box1 = new Box<String>();
		Box<String> box2 = new Box<String>();
		var box3 = new Box<String>(); //뒤에 타입에 의해서 타입유추
		
		//재 할당시 같은 타임만 가능
		var f = 10;
		f = 20;
//		f = "String!";안됨 
		
		//var 사용시 읽기 쉬운 코드인가 고민하고 사용 
		
		var list2 = new ArrayList<String>();
		//긴코드
		for(String item : list2) {
			
		}
		//타입부분을 보고 String 유츄 가능하기에 괜찮음
		
		//긴 코드 이후 var가 어떤 타입인지 유츄가 되지 않음 
		for(var item: list2) {
			
		}
		
		
		//var는 키워드가 아님
		int var = 3; //사용 가능 하지만 변수명으로 사용하지 말것 
		
		
	}
	
}
