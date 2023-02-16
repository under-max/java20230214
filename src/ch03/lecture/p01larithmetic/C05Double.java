package ch03.lecture.p01larithmetic;

import java.math.BigDecimal;

public class C05Double {
	public static void main(String[] args) {
		double a = 0.1; //0.00011001100
		double b = 0.2; //0.00110011001
		double c = a + b;
		
		System.out.println(c);//0.3000000000000004
		
		BigDecimal num1 = new BigDecimal("0.1");
		BigDecimal num2 = new BigDecimal("0.2");
		
		BigDecimal res = num1.add(num2);
		System.out.println(res);
	}
}
