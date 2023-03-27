package ch12.lecture.p06annotation;

public class C01Annotation {
	public static void main(String[] args) {
		//컴파일시 사용 하는 정보전달
		//빌드풀이 코드를 자동으로 생성할 때 사용하는 정보전달
		//실행시 특정 기능을 처리할때 사용하는 정보전달
	}
}

@MyAnnotation01
class MyClass{
	@MyAnnotation01
	String field;
	
	@MyAnnotation01
	public MyClass() {
		// TODO Auto-generated constructor stub
	}
	
	@MyAnnotation01
	void method1() {
		@MyAnnotation01
		int var;
	}
}

@interface MyAnnotation01{
	
}
