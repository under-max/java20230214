package ch18.lecture.p02OutStream;

import java.io.*;

public class C04Close {
	public static void main(String[] args) {
		
		//try with resources 에 사용되는 코드가 복잡할 경우 
		//try 밖으로 뺼수 있음 
		OutputStream os = new FileOutputStream("");
		OutputStream os2 = new FileOutputStream("");
		OutputStream os3 = new FileOutputStream("");
		
		try (os; os2; os3){
						
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
