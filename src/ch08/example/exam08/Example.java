package ch08.example.exam08;

public class Example {
	public static void action(A a) {
		if(a instanceof C c) {
			c.method2();
		}
	}
	
	public static void main(String[] args) {
		action(new B());
		action(new C());
		
		String d = "hello";
		int num1 = 1;
		int num2 = 2;
		String[] arr = new String[d.length()];
		arr = d.split("");
		
		String temp = "";
		temp = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = temp;
		
	}
}
