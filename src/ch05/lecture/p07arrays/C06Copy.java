package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C06Copy {
	public static void main(String[] args) {
		int[][] arr1 = { //주소값1 (주소값2 + 주소값3)
				{ 3, 4 }, // 주소값2 
				{ 9, 8 } //주소값3
		};
		//얕은복사
		int[][] arr2 = Arrays.copyOf(arr1, arr1.length); //arr1[0~1][]의값의 주소값을 복사하의미라 첫번째의[]index는 틀려도 두번쨰 이어갈때부터
		//같은 주소값을 참조함
		
		
	}
		
}

