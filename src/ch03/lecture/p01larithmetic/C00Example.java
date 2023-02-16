package ch03.lecture.p01larithmetic;

public class C00Example {
	public static void main(String[] args) {
		System.out.println("---------------------3번");
		int pencils = 534;
		int student = 30;
		
		int pencilsperStudent = pencils / student;
		System.out.println(pencilsperStudent);
		
		int pencilsleft = pencils % student;
		System.out.println(pencilsleft);
		
		System.out.println("---------------------4번");
		
		int value = 356;
		System.out.println(value /100 * 100);
		System.out.println("---------------------5번");
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area1 = (lengthBottom + lengthTop) * height /2.0;
		System.out.println(area1);
		
		double area2 = (lengthBottom + lengthTop) * height * 1.0 / 2;
		System.out.println(area2);
		
		double area3 = (double)(lengthBottom + lengthTop) * height /2;
		System.out.println(area3);
		
		double area4 = (double)((lengthBottom + lengthTop) * height /2);
		System.out.println(area4);
		
		System.out.println("---------------------7번");
		
		double x = 5.0;
		double y = 0.0;
		double z = 5 % y;
		
		if(Double.isNaN(z)) {
			System.out.println("0.0으로 나눌 수 없습니다");
		}else {
			double result = z +10;
			System.out.println("결과 : " + result);
		}
	}
}
