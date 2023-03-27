package ch12.lecture.p06annotation;

public class C08Annotation {
	public static void main(String[] args) {
		
	}
}

class MyClass08 {
	@MyAnnotation08
	int f1;
	@MyAnnotation08(value = 100)
	int f2;
	@MyAnnotation08(100)
	int f3;
	@MyAnnotation08(value = 100, name = "lee") //여러개 주려면 생략할 수 없음 
	int f4;
}


@interface MyAnnotation08{
	int value() default 0;
	String name() default "kim";
	int age() default 0;
}
