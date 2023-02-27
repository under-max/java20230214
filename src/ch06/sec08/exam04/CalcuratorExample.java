package ch06.sec08.exam04;

public class CalcuratorExample {
	public static void main(String[] args) {
		Calcurator myCalcu = new Calcurator();
		
		double result1 = myCalcu.areaRectangle(10);
		
		double result2 = myCalcu.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이 : " + result1);
		System.out.println("직사각형 넓이 : " + result2);
	}
}
