package ch18.lecture.p02OutStream;

import java.io.*;

public class C06OutPutStream {
	public static void main(String[] args) {
		try (var os = new FileOutputStream("output/output6.txt")) {
			// 한바이트 쓰기
			os.write(29873004); //1
			os.write(92873492); // 여러숫자 넣어도 1byte 만 사용
			
			byte[] data = { 3, 1, 0, 127, 64 };
			os.write(data); // 5
			os.write(data); //5
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		try (var is = new FileInputStream("output/output6.txt");) {
			System.out.println(is.read());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
