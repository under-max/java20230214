package ch06.excercise.exam16;

public class PrinterExample {
	public static void main(String[] args) {
		//println메소드를 오버로딩하여 선언
		//리턴타입 void
		//메소드 이름 println
		//매개변수 int boolean double String
		Printer printer = new Printer();
		
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
	}
}
