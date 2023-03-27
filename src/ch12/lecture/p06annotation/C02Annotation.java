package ch12.lecture.p06annotation;

import java.lang.annotation.*;

public class C02Annotation {
	public static void main(String[] args) {
		Class c1 = MyClass02.class;
		Annotation[] annotation = c1.getAnnotatedInterfaces();
		System.out.println(annotation);
	}
}

@MyAnnotation02
class MyClass02{
	
}
//어노테이션이 컴파일러때 까지 유지되어야함 유지를 위해 Retention 적용
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation02 {
	
}
