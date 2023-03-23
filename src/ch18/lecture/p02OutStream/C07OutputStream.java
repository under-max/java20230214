package ch18.lecture.p02OutStream;

import java.io.*;

public class C07OutputStream {
	public static void main(String[] args) {
		try (var os = new FileOutputStream("output/output7.txt")) {

			os.write(30); //1byte
			os.write(192734); //1byte

			// 여러바이트 쓰기
			byte[] data = { 3, 3, 3, 3, 3, 3, 3, 3, 3 };
			os.write(data); //9byte
			
			//여러바이트 쓰기 (배열의 일부분)
			os.write(data, 0, 3); //0번부터 3개 //3byte
			os.write(data, 4, 5); //4번부터 5개 // 5byte
			os.write(data, 0 , data.length);//끝까지 9byte
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
