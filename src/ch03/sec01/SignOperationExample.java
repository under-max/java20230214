package ch03.sec01;

public class SignOperationExample {
	public static void main(String[] args) {
		int x = -100;
		x = -x;
		System.out.println("x: " + x);
		
		byte b = 100;
		int y = -b; //산술계산은 Integer 계산이므로 Integer로 받음 
		System.out.println("y: " + y);
	}
}
