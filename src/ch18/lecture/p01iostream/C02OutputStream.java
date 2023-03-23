package ch18.lecture.p01iostream;

import java.io.*;

public class C02OutputStream {
	public static void main(String[] args) {
		//outputStream 
		//바이트단위 출력 스트림 
		
		try {
			String des = "output/output1.txt";
			OutputStream os = new FileOutputStream(des);
			os.write(1);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램종료");
		
		
	}
}
