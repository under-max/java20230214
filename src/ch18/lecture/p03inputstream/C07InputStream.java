package ch18.lecture.p03inputstream;

import java.io.*;

public class C07InputStream {
	public static void main(String[] args) {
		String src = "output/black.jpg";
		String des = "output/black_copy4.jpg";
		
		try (var is = new FileInputStream(src);
				var os = new FileOutputStream(des)){
			is.transferTo(os);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("복사완료");
	}
}
