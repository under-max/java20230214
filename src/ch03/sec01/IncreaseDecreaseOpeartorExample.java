package ch03.sec01;

public class IncreaseDecreaseOpeartorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++; // 10 추후 계산식에서 11
		++x; // 전 값 올라오고 12 
		System.out.println("x: "+ x); //12
		System.out.println("--------------");
		
		y--; //10 추후 계산식에서 9
		--y; //전값 올라오고 8
		System.out.println("y: "+ y); //8
		
		System.out.println("--------------");
		z = x++; //12 추후 계산식에서 13
		System.out.println("z= "+ z); //12
		System.out.println("x= "+ x); //13
		
		System.out.println("--------------");
		z = ++x;
		System.out.println("z= " + z);//14
		System.out.println("x= " + x); //14
		
		System.out.println("--------------");
		z = ++x + y ++;
		System.out.println("z= " + z); //15 + 8(추후 계산식에서 9) = 23
		System.out.println("x= " + x); // 15
		System.out.println("y= " + y); // 9
	}
}
