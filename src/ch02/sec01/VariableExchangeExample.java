package ch02.sec01;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("변경 전 X는 " + x + " 변경 후 Y는 " + y);

		int temp = 0;
		temp = x;
		x = y;
		y = temp;

		System.out.println("변경된 X의 값은 " + x + "변경된 Y의 값은 " + y);

	}
}
