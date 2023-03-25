package ch19.lecture.pC01network;

import java.io.*;
import java.net.*;

public class C04Client {
	public static void main(String[] args) {
		//ip주소
		String ipAdd = "172.30.1.30";
		//port번호
		int portNum = 50500;
		try (
				Socket socket = new Socket(ipAdd, portNum);
				OutputStream os = socket.getOutputStream();
				
				BufferedOutputStream bos = new BufferedOutputStream(os);
				PrintStream ps = new PrintStream(bos);
				){
			ps.print("Hello server, i'm client 123");
			
			os.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	    
	    System.out.println("클라이언트 종료");
		
	}
}
