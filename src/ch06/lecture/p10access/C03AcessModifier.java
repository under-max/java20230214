package ch06.lecture.p10access;

import ch06.lecture.p10access.package1.*;

public class C03AcessModifier {
	public static void main(String[] args) {
		MyClass03 o1 = new MyClass03();
//		MyClass03 o2 = new MyClass03(6); //private 라 접근 불가능 
//		MyClass03 o3 = new MyClass03("Hello")// default 패키지가 틀려서 접근 불가능 (package private)
	}
}
