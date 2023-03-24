package ch18.lecture.p07print;

import java.io.*;

public class C02PrintStream {	
	public static void main(String[] args) {
		String name = "output/print2.txt";
		
		try {
			PrintStream pw = new PrintStream(name);
			
			pw.println(99999);
			pw.println(9.99999);
			pw.println(false);
			pw.println("Hello world");
			pw.println("더글로리");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
