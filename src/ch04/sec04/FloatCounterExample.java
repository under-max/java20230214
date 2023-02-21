package ch04.sec04;

public class FloatCounterExample {
	public static void main(String[] args) {
		for(float x = 0.1f; x <= 1.0f; x+= 0.1f) {
			System.out.println(x); //부동소수점 문제로 0.7부터 잘못찍힘
		}
	}
}
