package ch19.lecture.pC01network;

import java.io.*;
import java.net.*;

public class C02NetWorkClient {
	public static void main(String[] args) {
		//주소, 포트번호 알면 연결 가능 
		//ip 주소
		String ip = "223.130.200.107";
		
		//port 번호
		int port = 80;
				
		
		try (Socket socket = new Socket(ip,port);
				InputStream is = socket.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				){
			
			char[] buf = new char[1024];
			int len = 0;
			while((len = br.read(buf)) != -1) {
				System.out.println(new String(buf, 0 ,len));
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
	}
}
