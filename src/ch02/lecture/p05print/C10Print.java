package ch02.lecture.p05print;

public class C10Print {
	public static void main(String[] args) {
		//Flag 
		//- : 왼쪽 정렬 
		
		System.out.printf("%d%n", 33);
		System.out.printf("%5d%n", 33);
		System.out.printf("%-5d%n", 33); //5칸 차지해서 왼쪽 정렬 
		
		System.out.printf("%-10s입니다%n", "son");
		
		//0 : 0으로 채움 수 
		System.out.printf("%d%n", 99);
		System.out.printf("%5d%n", 99);
		System.out.printf("%05d%n", 99); // 앞에 0 넣으면 빈칸만큼 0이 들어감 
		System.out.printf("%1$05d%n", 99);
		
		System.out.printf("%010f%n", 3.14);
		
		//precision : 소수점 이하 자릿수 
		System.out.printf("%10.3f\n", 3.14); //기본이 6자리  소수점 몇번째 자리까지 출력할껀지 결정 .x
		System.out.printf("%10.3f\n", 3.14);
		System.out.printf("%10.3f\n", 3.555555);
		
		System.out.printf("%010.3f\n", 3.555555);
		System.out.printf("%1$010.3f\n", 3.55555);
	}
}
