package ch02.lecture.p05print;

public class C07Print {
	public static void main(String[] args) {
		int age = 30;
		String name = "son";
		
		System.out.printf("이름은 %s이고 나이는 %d 입니다\n", name, age);
		System.out.printf("나이는 %d이고 이름은 %s 입니다\n", age, name);
		
		// $숫자로 위치 지정가능
		System.out.printf("이름은 %2$s이고 나이는 %1$d 입니다\n", age, name);
		
	}
}
