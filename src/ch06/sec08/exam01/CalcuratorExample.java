package ch06.sec08.exam01;

import java.util.HashSet;

public class CalcuratorExample {
	public static void main(String[] args) {
		Calcurator myCalc = new Calcurator();

		myCalc.powerOn();

		int result1 = myCalc.plus(5, 6);
		System.out.println("result1 : " + result1);

		int x = 10;
		int y = 4;

		double result2 = myCalc.divied(x, y);

		System.out.println("result2 : " + result2);

		myCalc.powerOff();
		
	}
}
