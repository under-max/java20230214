package ch18.lecture.p06buffer;

import java.io.*;

public class C04InputStream {
	public static void main(String[] args) {
		String name = "output/buffered1.txt";
		try (InputStream fis = new FileInputStream(name)){
			long start = System.nanoTime();
			for(int i =0; i < 1000*1000; i++) {
				fis.read();
			}
			
			long end = System.nanoTime();
			System.out.println((end-start) + "ns");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("실행종료");
		
//		925799700ns
//		실행종료
	}
}
