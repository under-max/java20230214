package ch19.lecture.p02http;

import java.io.*;
import java.net.*;

public class C02Server {
	public static void main(String[] args) {
		int port = 80;
		
		
		try (
				ServerSocket serverSocket = new ServerSocket(port);
				){
			
			System.out.println("요청 기다림");
			
			try (
					Socket socket = serverSocket.accept();
					
					OutputStream osw = socket.getOutputStream();
					PrintStream ps = new PrintStream(osw);
					){
				String body = """
						<h1>This is Naver</h1>
						<h3>다른사이트로 이동</h3>
						<ul>
							<li><a href="https://www.daum.net">daum</a></li>
							<li><a href="https://www.google.com">google</a></li>
						<ul>
						""";
				
				int length = body.getBytes().length;
				//첫줄 버전 상태코드 상태텍스트 
				ps.println("HTTP/1.1 200 OK");
				
				//두번째줄 헤더들
				ps.println("Content-type: text/html; charset= UTF-8");
				ps.println("Content-length");
				//빈줄
				ps.println();
				//응답 본문 
				ps.print(body);
				
				ps.flush();
				
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("서버 종료!");
		
	}
}
