package ch18.lecture.p06buffer;

import java.io.*;

public class C02OutputStream {
	public static void main(String[] args) {
		String name = "output/buffered1.txt";
		try (OutputStream fis = new FileOutputStream(name);){
			long start = System.nanoTime();
			for(int i =0; i < 1000*1000; i++) {
				fis.write(1);
			}
			fis.flush();
			long end = System.nanoTime();
			System.out.println((end-start) + "ns");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("실행종료");
	}
}
