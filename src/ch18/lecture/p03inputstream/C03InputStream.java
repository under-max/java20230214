package ch18.lecture.p03inputstream;

import java.io.*;

public class C03InputStream {
	public static void main(String[] args) {
		try(InputStream is = new FileInputStream("output/output6.txt")) {
			byte[] arr = new byte[5];
			int len1 = is.read(arr); //5
			int len2 = is.read(arr); //5
			int len3 = is.read(arr); //2
			int len4 = is.read(arr); //-1
			
			System.out.println(len1);
			System.out.println(len2);
			System.out.println(len3);
			System.out.println(len4);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
