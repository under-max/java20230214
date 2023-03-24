package ch18.p10file;

import java.io.*;

public class C01File {
	public static void main(String[] args) {
		//file(file 또는 directory)에 관한 객체
		
		File file = new File("src/ch15/lecture/p10file/C01File.java");
		
		System.out.println(file.getName()); //파일의 이름 
		System.out.println(file.length()); //파일의 크기 
		System.out.println(file.exists()); //파일의 존재여부
		System.out.println(file.isFile()); //파일인지?
		System.out.println(file.isDirectory()); //디렉토리인지? 
	}
}
