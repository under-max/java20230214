package ch04.example;

public class Example06 {
public static void main(String[] args) {
	//피라미드 정방향 아랫단 5
	
	for(int i = 1; i <= 5; i++) {
		for (int j = 0; j < i; j++) {
			System.out.printf("*");
		}
		System.out.println();
	}
	
	for(int i = 1; i <= 5; i++) {
		for(int j = 5; i < j; j--) {
			System.out.printf(" ");
			
		}
		for(int k = 0; k < i; k++) {
			System.out.printf("*");
		}
		System.out.println();
	}
	
	int kRange = 1;
	for(int i = 1; i <= 6; i++) { //right
		for(int j = 6; i < j; j--) {
			System.out.printf(" ");
			
		}
		for(int k = 0; k < kRange; k++) {
			System.out.printf("*");
			
		}
		kRange += 2;
		System.out.println();
	}
	
	int xRange = 11;
	int jRange = 1;
	for(int i = 1; i <= 6; i++) { //right
		for(int j = 1; j < jRange; j++) {
			System.out.printf(" ");
			
		}
		for(int x = 0; x < xRange; x++) {
			System.out.printf("*");
			
		}
		xRange -= 2;
		jRange += 1;
		System.out.println();
	}
	
	
	}
}
