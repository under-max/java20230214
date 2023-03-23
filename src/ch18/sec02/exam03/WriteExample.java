package ch18.sec02.exam03;

import java.io.*;

public class WriteExample {
	public static void main(String[] args) {
		try (OutputStream os = new FileOutputStream("C:/Temp/test3.db")) {
			byte[] array = { 10, 20, 30, 40, 50 };
			os.write(array, 1 ,3);
			os.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
