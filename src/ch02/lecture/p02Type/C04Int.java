package ch02.lecture.p02Type;

public class C04Int {
	public static void main(String[] args) {
		//int (4bytes) - > 32bits
		//가장 큰값  -> 0111 1111 1111 1111 1111 1111 1111 1111 ->2147483647
		//가장 작은 값  ->  1111 1111 1111 1111 1111 1111 1111 1111 -> -2147483648
		
		int i1 = -2147483648;
		i1 = 2147483647;
		
//		i1 = 2147483648; 오류 범위 초과
//		i1 = -2147483649;
	}
}
