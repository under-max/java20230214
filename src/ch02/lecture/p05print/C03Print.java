package ch02.lecture.p05print;

public class C03Print {
	public static void main(String[] args) {
		int x = 3;
		String y = "Hellow world~";
		System.out.printf("%d의 제곱은 %d 입니다 \n", x, x * x);// 형식에 맞춰서 출력
		System.out.printf("%s Java %s\n", y, y + " " + y);

		System.out.printf("어떤 형식 \n");
		System.out.println("또 다른 형식\n");

		// %n 새로운 줄
		System.out.printf("새로운 줄 포함 %n새로운줄에 출력됨%n");
		System.out.printf("새로운 줄 포함 \n새로운줄에 출력됨\n");

		// \n 새로운 줄
		System.out.printf("역슬래시 사용 \n새 줄?%n");
		
		// %d : 10진법 정수
		System.out.printf("10진법 정수 %d%n", 10);
		System.out.printf("또 다른 정수 %d", 300);
		
		System.out.printf("%n또 다른 정수 %s", "삼백");
		System.out.printf("%n정수 %s", "3000");
		System.out.printf("%n정수 %f", 3.14);
		// %f 10진수 실수
		System.out.printf("%n10진법 실수 %f", 3.1452147587862);
		System.out.printf("%n10진법 실수 %f", 9.999);
		System.out.printf("%n10진법 실수 %f", (float)3);
		
		//%s 문자열
		
		System.out.printf("%n문자열 %s", "Hello");
		System.out.printf("%n문자열 %s", "World");
		System.out.printf("%n문자열 %s", "Hello" + " " + "World");
		System.out.printf("%n문자열 %s", 3.14);
		System.out.printf("%n문자열 %s", 9);

		System.out.printf("%n%s World", "hi");
		System.out.printf("%n%d 숫자", 999);
		System.out.printf("%n.....%f...... ", 3.14);
		
		
		
		
	}
}
