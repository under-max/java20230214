package ch18.lecture.p08byte_to_char;

import java.io.*;

public class C02InputStreamReader {
	public static void main(String[] args) throws IOException{
		String name = "output/byte1.txt";
		InputStream is = new FileInputStream(name);
		InputStreamReader isr = new InputStreamReader(is); //문자단위 가능
		
		int f1 = is.read();
		System.out.println((char) f1);
		
		int f2 = isr.read();
		System.out.println((char) f2);
		
		int f3 = isr.read();
		System.out.println((char) f3);
		int f4 = isr.read();
		System.out.println((char) f4);
		
		
	}
}
