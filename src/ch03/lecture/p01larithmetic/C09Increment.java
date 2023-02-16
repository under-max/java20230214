package ch03.lecture.p01larithmetic;

public class C09Increment {
	public static void main(String[] args) {
		//증가 연산자 ++
		//감소 연산자 --
		
		int x = 1;
		int y = 1; 
		x++; //x = 2
		++x; //x =3
		
		y--; // y = 0;
		--y; // y = -1
		
		System.out.println(x);
		System.out.println(y);
		
		int z = x++ + 10; //13
		System.out.println(z);
		int w = ++y + 10; // 10
		System.out.println(w);
		int q = x++ + 10; // 15
		System.out.println(x);
	}
}
