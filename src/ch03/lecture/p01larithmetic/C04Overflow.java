package ch03.lecture.p01larithmetic;

public class C04Overflow {
	public static void main(String[] args) {
		int a = 15_0000_0000;
		int b = 17_0000_0000;
		
		System.out.println(a);
		System.out.println(b);
		//더해서 오버플로우 
		int c = a + b;
		System.out.println(c);
		
//		long c = a + b;
		int d = -15_0000_0000;
		int e = -17_0000_0000;
		
		System.out.println(d);
		System.out.println(e);
		//오버플로우 음수값이 뚫고 양수로 바뀜 계산할때 이러한 현상이 일어나므로 계산시 주의
		int f = d + e;
		System.out.println(f);
	}
}
