package ch12.lecture.p05reflection;

public class C01Reflection {
	public static void main(String[] args) throws Exception {
		//reflection
		//클래스에 관한 정보 
		
		//클래스 정보를 가진 객체 생성
		
		//클래스의 .class 속성으로 얻기
		Class<String> class1 = String.class; 
		
		//forname.static method로 얻기
		Class<String> class2 = (Class) Class.forName("java.lang.String");
	
		
		//3.객체로 부터 얻기
		String s1 = "java";
		Class<String> class3 = (Class) s1.getClass();
		
		System.out.println(System.identityHashCode(class1));
		System.out.println(System.identityHashCode(class2));
		System.out.println(System.identityHashCode(class3));
	}
}
