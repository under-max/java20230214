package ch12.lecture.p01object;

public class C03ToString {
	public static void main(String[] args) {
		MyClass03 o1 = new MyClass03();
		String s1 = o1.toString(); //객체의 설명을 리턴
		System.out.println(s1);
		
		Object o2 = o1;
		System.out.println(o2.toString());
		System.out.println(System.identityHashCode(o2));
		
			
		Object o3 = new MyClass03();
		System.out.println(System.identityHashCode(o3));
		System.out.println(o3.toString());
		
		//해쉬코드 오브젝트가 가지고 있는 메소드 
		//객체의 hashValue 
		//System.identityHashCode를 16진법으로 나타냄
	}
}

class MyClass03{
	
}
