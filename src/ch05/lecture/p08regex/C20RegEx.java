package ch05.lecture.p08regex;

import java.util.Arrays;

public class C20RegEx {
	public static void main(String[] args) {
		String str1 = " al ad al   alasd a    asdfkgl   asdf  asdi;d  a";
		//공백 제거
		String str2 = str1.replaceAll("\\s", "");
		
		System.out.println(str1);
		System.out.println(str2);
		
		String str3 = "asddf        ,          asdafsdfm,asdsdgfm    ,    dofgjdofg";
		
		String[] str4 = str3.split("\\s*,\\s*");
		System.out.println(Arrays.toString(str4));
		for(String fa : str4) {
			System.out.println(fa);
		}
		
	}
}
