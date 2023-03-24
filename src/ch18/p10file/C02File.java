package ch18.p10file;

import java.io.*;

public class C02File {
	public static void main(String[] args) {
		File file = new File("output");
		
		System.out.println(file.getName());
		System.out.println(file.length());
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		
		
		System.out.println("디렉토리 내 파일목록");
		File[] files = file.listFiles();
		for(File f : files) {
			System.out.println(f);
		}
		
	}
}
