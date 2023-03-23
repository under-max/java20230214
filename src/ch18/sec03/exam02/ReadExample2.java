package ch18.sec03.exam02;

import java.io.*;
import java.util.*;

public class ReadExample2 {	
	public static void main(String[] args) {
		try (var is = new FileInputStream("C:/Temp/test3.db")){
			byte[] data = new byte[5]; //{0,0,0,0,0}
			System.out.println(Arrays.toString(data));
			System.out.println(is.read());
			
			is.read(data);
			System.out.println(Arrays.toString(data));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
