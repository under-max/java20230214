package ch18.example.exam07;

import java.io.*;
import java.util.*;

public class Example {
	public static void main(String[] args) throws Exception{
		String filePath = "src/ch18/example/exam07/Example.java";
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		int rowNumber = 0;
		String rowData;
		
		while(true) {
			rowData = br.readLine();
			if (rowData == null) break;
			System.out.println(rowNumber + "" + rowData);
			rowNumber += 1;
			
		}
				
		br.close();
		fr.close();
			
		
	}
		
	
}
