package ch03.lecture.p06string;

import java.awt.image.IndexColorModel;

public class C07Substring {
	//Substring
	//문자열의 일부 (Substring)을 리턴
	//return type = String
	public static void main(String[] args) {
		String str1 = "중국 재개방이 글로벌 인플레이션 촉발하지 않는 이유";
		String res1 = str1.substring(0, 2); //시작 index(포함), 종료위치 index (포함안됨)
		System.out.println(res1);
		
		String res2 = str1.substring(3, 6);
		System.out.println(res2);
		System.out.println(str1.substring(3, 6));
		
		System.out.println(str1.substring(str1.indexOf("글"), str1.length()));
		
		//파라미터 하나 : 시작 ~ 끝까지 
		System.out.println(str1.substring(0));
		
		//파라미터가 인덱스를 벗어나면 오류 발생 
		String str2 = "java";
		System.out.println(str2.substring(2, 4));
//		System.out.println(str2.substring(2, 5));//error
		
	}
	
}
