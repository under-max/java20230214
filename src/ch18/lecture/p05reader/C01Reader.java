package ch18.lecture.p05reader;

import java.io.*;

public class C01Reader {
	public static void main(String[] args) {
		//Reader : 문자단위 입력 스트림 
		//주요메서드 : read
		
		String name = "output/writer2.txt";
		
		try (Reader rd = new FileReader(name)){
			int c1 = rd.read();
			System.out.println(c1); //'가'의 유니코드 
			System.out.println((char)c1); //'가'의 유니코드 강제형변환
			
			int data = 0;
			while((data = rd.read()) != -1) {
				System.out.println(data + " " + (char)data);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
