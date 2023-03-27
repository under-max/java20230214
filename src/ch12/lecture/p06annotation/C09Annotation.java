package ch12.lecture.p06annotation;

public class C09Annotation {
	public static void main(String[] args) {
		
	}
}

class MyClass09{
	@MyAnnotation09 (val1 = "hi", val2= {"a","b"})
	int f1;
	@MyAnnotation09 (val1 = "hi", val2= "a") //val2값 하나면 중가로 생략 가능
	int f2;
	@MyAnnotation09 (val1 = "hi", val2= "b")
	int f3;
}


@interface MyAnnotation09 {
	String val1();
	String[] val2();
}