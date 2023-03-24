package ch18.lecture.p06buffer;

import java.io.*;

public class C06BufferedRead {
	public static void main(String[] args) {
		String name = "output/buffered5.txt";
		
		try {
			FileReader fr = new FileReader(name);
			BufferedReader br = new BufferedReader(fr);
			String s = null;
			
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
