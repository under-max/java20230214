package ch12.lecture.p05reflection;

import java.lang.reflect.*;

public class C02Reflection {
	public static void main(String[] args) {
		Class class1 = String.class;
		
		// 이름을 알고싶을 경우 (full name)
		class1.getName();
		System.out.println(class1.getName());
		
		//이름(simple)
		System.out.println(class1.getSimpleName());
		
		//패키지 정보 
		System.out.println(class1.getPackageName());
		
		//생성자 정보 
		System.out.println(class1.getConstructors());
		Constructor[] constructor = class1.getConstructors();
		
		//필드
		Field[] fields = class1.getFields();
		
		//메소드
		Method[] method = class1.getMethods();
		//클래스 타입의 인스턴스로 정보를 알수 있음 
		
		
	}
}
