package ch19.lecture.pC01network;

import java.io.*;
import java.net.*;

public class check {
	public static void main(String[] args) {
		
		while(true) {
			ServerSocket serverSocket = new ServerSocket();
			Socket socket = serverSocket.accept();
			
			InputStream is = socket.getInputStream();
			BufferedInputStream bis = new BufferedInputStream(is);
			InputStreamReader isr = new InputStreamReader(bis);
			
			
			
		}
		
		
		
		
	}
}
