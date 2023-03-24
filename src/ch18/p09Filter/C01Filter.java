package ch18.p09Filter;

import java.io.*;

public class C01Filter {
	public static void main(String[] args) {
		//stream 연결 가능
		String fileName = "output/byte1.txt";
		
		try {
			FileInputStream fis = new FileInputStream(fileName);
			InputStreamReader isr = new InputStreamReader(fis); //읽기위해서 등장 
			BufferedReader br = new BufferedReader(isr); //효율적으로 읽기위해 등장 

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
