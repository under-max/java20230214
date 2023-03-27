package ch12.lecture.p06annotation;

import java.lang.annotation.*;

public class C03Annotation {
	public static void main(String[] args) {
		Class c1 = MyClass03.class;
		
		
	}
	
	
}

@MyAnnotation03
class MyClass03 {
	
	@MyAnnotation03
	String field;
	
	@MyAnnotation03
	public MyClass03() {
		// TODO Auto-generated constructor stub
	}
	
	@MyAnnotation03
	void method1() {
		
	}
}

@Target(ElementType.FIELD) //annotation 타겟적용 
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation03{
	
}
