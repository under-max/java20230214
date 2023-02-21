package ch04.example;

public class Example03 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			if(i % 3 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
		
		sum = 0;
		for(int j = 1; j <=100; j++) {
			if(j % 3 == 0) {
				sum += j; 
			}
		}
		System.out.println(sum);
		
		sum = 0;
		for(int k = 0; k <=100; k += 3) {
			
				sum += k; 
			
		}
		System.out.println(sum);
//		double sum = 0;
//		int [] a = {1,2,3,4,5};
//		System.out.println(a.length);
//		for(int m = 0; m < a.length; m++) {
//			sum = (double)a[m.length];
//		}
//		System.out.println(sum);
	}
}
