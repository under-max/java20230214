package ch12.lecture.p06annotation;

public class C07Annotation {
	public static void main(String[] args) {
		
	}
}

class MyClass07 {
	@MyAnnotation07(value = "hello") //생략 가능함 
	String field1;
	@MyAnnotation07("greeting")
	String field2;
	@MyAnnotation07("hi")
	String field3;
}


@interface MyAnnotation07 {
	String value();
}
