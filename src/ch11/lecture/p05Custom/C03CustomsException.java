package ch11.lecture.p05Custom;

public class C03CustomsException {
	public static void main(String[] args) {
		MyException1 e = new MyException1();
		
		MyException1 e1 = new MyException1("some message");
		
		System.out.println(e.getMessage());
		System.out.println(e1.getMessage());
		
	}
}

class MyException1 extends Exception {
	public MyException1 () {
		
	}
	
	public MyException1 (String message) {
		super(message);
	}
}
