package ch04.example;

public class Example04Break {
	//5가 나오면 break
	public static void main(String[] args) {
		while(true) {
			int num1 = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*6)+1;
			
			int result = num1 + num2;
			
			System.out.println("num1 : " + num1 + " num2 : " + num2 + " result = " + result);
			
			if(result == 5) {
				break;
			}
		}
	}
}
