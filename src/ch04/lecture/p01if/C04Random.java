package ch04.lecture.p01if;

public class C04Random {
	public static void main(String[] args) {
		// Math.Random()
//		0 < = Math.Random() < 1 의 double 값 리턴 
		int res1 = (int) (Math.random() * 3);
		System.out.println(res1);
		
		//0 ~ 3
		int res2 = (int) (Math.random() * 3)+1;
		System.out.println(res2);
		
		int res3 = (int) (Math.random() * 6) +1;
		System.out.println(res3);
		
		int res4 = (int) (Math.random() * 45) + 1;
		System.out.println(res4);
	}
}
