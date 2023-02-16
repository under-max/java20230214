package ch03.lecture.p01larithmetic;

public class C07Divide {
	public static void main(String[] args) {
		//실수를 0으로 나누면 무한대 (Infinity)
		
		double a = 0.0;
		double b = 3.0;
		double c = b / a;
		
		System.out.println(c);
//		양의 무한대 음의 무한대가 있음 
		double d = -3.0;
		double e = d / a;
		System.out.println(e);
		
//		실수를 0으로 나눈 나머지 : Nan
		double f = 3.0 % 0.0;
		System.out.println(f);
		
		double g = f + 1.0;
		System.out.println(g);
		//Infinity 인지 확인 
		boolean isInfinity = Double.isInfinite(c);
		System.out.println(isInfinity);
		
		boolean isInfinity1 = Double.isInfinite(d);
		System.out.println(isInfinity1);
		
		//Nan인지 확인
		boolean isNan1 = Double.isNaN(f);
		System.out.println(isNan1);
		
		boolean isNan2 = Double.isNaN(2.0);
		System.out.println(isNan2);
	}
}
