package ch18.lecture.p08byte_to_char;

import java.io.*;

public class C01OutputStreamWriter {
	public static void main(String[] args) throws IOException{
		String fileName = "output/byte1.txt";
		OutputStream os = getOutput(fileName);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		
		os.write('a');
		os.write('b'); //바이트 단위이지만 영어가능 
		os.write('한');
		
		osw.write('한');
		osw.close();
	}
	
	public static OutputStream getOutput(String filename) throws FileNotFoundException {
		OutputStream os = new FileOutputStream(filename);
		return os;
	}
}
