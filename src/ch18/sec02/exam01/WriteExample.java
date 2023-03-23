package ch18.sec02.exam01;

import java.io.*;

public class WriteExample {
	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test1.db");
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush(); //데이터가 쌓여있으면 한번에 풀어버림
			os.close(); //닫음 
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
