package ch12.lecture.p06annotation;

import java.lang.annotation.*;

public class C05Annotation {
	public static void main(String[] args) {
		
	}
}

class MyClass05 {
	@MyAnnotation05(attr = "hello")
	String field1;
	@MyAnnotation05(attr = "freeting")
	int field2;
	
	
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation05 {
	//속성 (attribute, element) -> 어노테이션의 부가정보 
	String attr();
}
