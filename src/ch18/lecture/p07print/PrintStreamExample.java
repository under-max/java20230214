package ch18.lecture.p07print;

import java.io.*;

public class PrintStreamExample {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("C:/Temp/printstream.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.print("마치");
		ps.println("프린터가 출력하는 것 처럼");
		ps.println("데이터를 출력합니다");
		ps.printf("| %6 | %-10s | %10s | \n", 1, "홍길동", "도적");
		ps.printf("| %6 | %-10s | %10s | \n", 2, "김자바", "학생");
		
		ps.flush();
		ps.close();
		
	}
}
