package ch18.lecture.p03inputstream;

import java.io.*;

public class C06InputStream {
	public static void main(String[] args) {
		String src = "output/black.jpg"; //Is read
		String des = "output/black_copy2.jpg"; //Os write
		
		
		try (var is = new FileInputStream(src);
				var os = new FileOutputStream(des)){
			
			byte[] data = new byte[1024];
			
			int len = 0;
			while((len = is.read(data)) != -1) {
				System.out.println(len);
				os.write(data,0,len);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("복사완료");
	}
}
