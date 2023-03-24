package ch18.p09Filter;

import java.io.*;

public class C02Filter {
	public static void main(String[] args) {
		String fileName = "output/byte1.txt";
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			BufferedOutputStream bod = new BufferedOutputStream(fos);
			OutputStreamWriter osw = new OutputStreamWriter(bod);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
