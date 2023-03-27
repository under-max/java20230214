package ch19.lecture.p01network;

import java.io.*;
import java.net.*;

public class C01NetwrokServer {
	public static void main(String[] args) {
		//ip주소 
		//port 번호 
		
		int portNum = 50500;
		
		
		try (ServerSocket serverSocket = new ServerSocket(portNum);) {
			System.out.println("연결 기다리는중......");
			try (Socket socket = serverSocket.accept(); //socket 생성 
				OutputStream os = socket.getOutputStream();
				OutputStreamWriter osw = new OutputStreamWriter(os);
				BufferedWriter bw = new BufferedWriter(osw);){
				
				bw.write("Hello JSP, JYP?");
				bw.flush();
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	
	}
}
