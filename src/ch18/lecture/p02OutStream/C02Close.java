package ch18.lecture.p02OutStream;

import java.io.*;

public class C02Close {
	public static void main(String[] args) {
		//Colose
		//finally 블럭에서도 사용할수 있게 try 블럭 밖에서 선언 
		OutputStream os = null;
		try {
			//스트림 열고
			os = new FileOutputStream("output/output1.txt");
			
			//어떤 작업
			os.write(2);
			os.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//꼭닫아야 함 null 일수 있으니 체크 
			if(os != null) {
				try {
					os.close();  
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
	}
}
