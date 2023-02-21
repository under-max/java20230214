package ch04.example;



public class Example04DoWhile {
	public static void main(String[] args) {
		
		
		int num1 = 0;
		int num2 = 0;
		
		do {
			num1 = (int)(Math.random()*6)+1;
			num2 = (int)(Math.random()*6)+1;
			System.out.printf("num1: %d num2: %d\n",num1, num2);
		}while(!((num1 + num2) == 5));
		System.out.println("실행 종료");
		
		
		
	}
}
