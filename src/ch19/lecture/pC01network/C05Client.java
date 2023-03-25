package ch19.lecture.pC01network;

import java.io.*;
import java.net.*;
import java.util.*;

public class C05Client {
	public static void main(String[] args) throws Exception{
		//ip주소
//				String ipAdd = "172.30.1.30";
//				//port번호
//				int portNum = 50500;
//				try (
//						Socket socket = new Socket(ipAdd, portNum);
//						OutputStream os = socket.getOutputStream();
//						
//						BufferedOutputStream bos = new BufferedOutputStream(os);
//						PrintStream ps = new PrintStream(bos);
//						){
//					
//					String input = "";
//					try (Scanner scanner = new Scanner(System.in);){
//						System.out.println("서버에 보낼 데이터 작성");
//						input = scanner.nextLine();
//					} catch (Exception e) {
//					}
//					ps.println(input);
//					ps.flush();
//					
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			    
//			    System.out.println("클라이언트 종료");
		
		String ipAdd = "172.30.1.30";
		//port번호
		int portNum = 50500;
		Socket socket = new Socket(ipAdd, portNum);
		OutputStream os = socket.getOutputStream();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			
			BufferedOutputStream bos = new BufferedOutputStream(os);
			PrintStream ps = new PrintStream(bos);
			
			String input = "";
			System.out.println("서버에 보낼 데이터 작성");
			input = scanner.nextLine();
			ps.println(input);
			ps.flush();
			
			
		}
		
	}
}
