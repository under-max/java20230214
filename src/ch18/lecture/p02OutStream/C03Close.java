package ch18.lecture.p02OutStream;

import java.io.*;

public class C03Close {
	public static void main(String[] args) {
		//try with resources 
		
		try (OutputStream os = new FileOutputStream("");) { //여기서 객체 만들면 close 자동으로 만들어줌 
			os.write(1);
			os.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
