package ch05.lecture.p05null;

public class C01Null {
	public static void main(String[] args) {
		int[] arr1 = new int[] {1, 2};
		System.out.println(arr1);
		arr1 = null; //참조하는 객체 없음 arr1의 본래 값은 garbage가 됨 
		
		int len = arr1.length; //참조하는 객체 없음 예외 발생
		int val = arr1[0]; //null pointer exception 나타남
		
		System.out.println("실행 흐름");
		
	}
}
