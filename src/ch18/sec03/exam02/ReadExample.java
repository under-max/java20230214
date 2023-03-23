package ch18.sec03.exam02;

import java.io.*;

public class ReadExample {
	public static void main(String[] args) {
		try (InputStream is = new FileInputStream("C:/Temp/test2.db")){
			
			byte[] data = new byte[100];
			
			while(true) {
				int num = is.read(data); //3바이트만 채워지고 나머지 버려짐 
				if(num == -1) {
					break;
				}
				
				for(int i = 0; i < num; i++) {
					System.out.println(data[i]);
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
