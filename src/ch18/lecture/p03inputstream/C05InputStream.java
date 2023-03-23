package ch18.lecture.p03inputstream;

import java.io.*;

public class C05InputStream {
	public static void main(String[] args) {
		String src = "output/black.jpg";
		String des = "output/black_copy.jpg";
		
		
		try {
			var is = new FileInputStream(src); //입력
			var os = new FileOutputStream(des); //출력
			
			int data = 0;
			
			while ((data = is.read()) != -1) { 
				System.out.println(data);
				os.write(data); //os.write(0)
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("복사가 종료되었습니다.");
	}
}
