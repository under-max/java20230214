package ch06.lecture.p09package;
//static import
//static 멤버(field, method)

import ch06.lecture.p09package.package1.MyClass05;
import static ch06.lecture.p09package.package1.MyClass05.name;
import static ch06.lecture.p09package.package1.MyClass05.method1;
import static ch06.lecture.p09package.package1.MyClass05.method2;;
public class C05StaticImport {
	public static void main(String[] args) {
		
		String n = MyClass05.name;
		System.out.println(n);
		
		System.out.println(name);
		
		method1();
		method2();
	}
}
