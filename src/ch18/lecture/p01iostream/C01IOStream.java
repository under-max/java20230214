package ch18.lecture.p01iostream;

import java.util.*;

public class C01IOStream {
	public static void main(String[] args){
		//Input Output Stream
		
		//데이터 형태: 바이트 스트림, 문자 스트림
		
		//방향: 인풋스트림, 아웃풋 스트림
		//바이트단위 인풋 스트림: inputStream
		//바이트단위 아웃풋 스트림: outputSrream
		
		//문자단위 인풋스트림: Reader
		//문자단위 아웃풋스트림: Writer
		
		int n = 17;
		List<Integer> list = new ArrayList<>();
		for(int i = 1; i <= n; i++) {
			if(n%i == 0) {
				if(!(i % 2 == 0 || i % 3 == 0 || i % 7 == 0 || i == 1)) {
					list.add(i);
				}
			}			
		}
		if(list.size() != 1) {
			if(n >= 2) list.add(2);
			if(n >= 3) list.add(3);
			if(n >= 7) list.add(7);
		}
		int[] a = new int[list.size()];
		for(int i =0; i < a.length; i++) {
			a[i] = list.get(i);
		}
		
		
		
		System.out.println();
     }
 }
	



