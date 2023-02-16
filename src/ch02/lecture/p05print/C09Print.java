package ch02.lecture.p05print;

public class C09Print {
	public static void main(String[] args) {
		//width 출력할 때 차지할 문자 칸 수 
		System.out.printf("%d%n", 300);
		System.out.printf("%5d%n", 300);
		System.out.printf("%6d%n", 300);
		System.out.printf("%6d%n", 300300300); //6자리가 넘으면 원래 자리로 옴 

		System.out.printf("%6s%n", "Hi");
		System.out.printf("%6s%n", "Hello World");
		
		int age = 33;
		String name = "son";
		
		System.out.printf("나이는 %2$3d 이름은 %1$10s 입니다%n", name, age);
		

		
	}
}
