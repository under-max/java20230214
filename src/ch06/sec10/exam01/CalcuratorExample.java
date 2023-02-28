package ch06.sec10.exam01;

import java.util.Arrays;

public class CalcuratorExample {
	public static void main(String[] args) {
		double result1 = 10 * 10 * Calcurator.pi;
		int result2 = Calcurator.plus(10, 5);
		int result3 = Calcurator.minus(10, 5);

		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);

		// Arrays.toString
		int[] arr = { 51, 22, 33 };
		System.out.println(Arrays.toString(arr));
	}

}
