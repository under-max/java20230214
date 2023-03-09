package ch13.lecture.p01generic;

import java.util.*;

public class C02Generic {
	public static void main(String[] args) {
		MyClass02<String> o1 = new MyClass02<>();
		o1.setItem("java");
		String s1 = o1.getItem();
		System.out.println(s1);
		System.out.println(s1.length());
		
		MyClass02<Scanner> o2 = new MyClass02<>();
		o2.setItem(new Scanner(""));
		Scanner sc = o2.getItem();
		System.out.println(sc.hasNext());
		
		//기본타입은 타입 아규먼트로 사용불가 하므로 wrapper type 사용
		MyClass02<Integer> o3 = new MyClass02<>();
		o3.setItem(3); //autoboxing
		int i = o3.getItem(); //unboxing 
		System.out.println(i);
	}
}


//Generic Type 
//T : Type Parameter
//type Parameter 작성 관습 => 대문자 한글자  
class MyClass02 <T> {
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
		
}
