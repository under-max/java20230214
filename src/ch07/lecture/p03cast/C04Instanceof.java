package ch07.lecture.p03cast;

public class C04Instanceof {
	public static void main(String[] args) {
		//Instanceof 연산자 
		//boolean 타입
		//왼쪽항 참조변수 오른쪽항 타입
		//true : 왼쪽항의 참조변수가 가리키는 객체가 오른쪽 항 type 이면 true 아니면 false
		
		Sub04 o1 = new Sub04();
		
		boolean b1 = o1 instanceof Sub04;
		System.out.println(b1);
		boolean b2 = o1 instanceof Super04;
		System.out.println(b2);
		
		Super04 o2 = new Super04();
		boolean b3 = o2 instanceof Super04;
		boolean b4 = o2 instanceof Sub04;
		System.out.println(b3+" "+ b4);
		
	}
}

class Sub04 extends Super04 {
	
}

class Super04{
	
}
