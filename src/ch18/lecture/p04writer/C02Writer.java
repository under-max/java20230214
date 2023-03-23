package ch18.lecture.p04writer;

import java.io.*;

public class C02Writer {
	public static void main(String[] args) {
		String name = "output/writer2.txt";

		try (var wr = new FileWriter(name)) {
			char[] data = { '가', '나', '다', 'a', 'b' };
			
			wr.write(data);
			
			wr.write("Hello World");
			wr.write("""
					Anybody Here?
					""" );
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
