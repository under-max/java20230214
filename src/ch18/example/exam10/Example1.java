package ch18.example.exam10;

import java.io.*;


public class Example1 {
	public static void main(String[] args) throws Exception {
		
		//파일명 입력받는 코드(option)
		String origin = "output/black.jpg";
		String copy = "output/black_copy10.jpg";
		//복사하는 코드 작성
		FileInputStream is = new FileInputStream(origin);
		BufferedInputStream bis = new BufferedInputStream(is);
		FileOutputStream os = new FileOutputStream(copy);
		BufferedOutputStream bos = new BufferedOutputStream(os);
		
		File dir = new File("output"); //파일경로 설정 File
		File file = new File("output/black.jpg");
		File file1 = new File("output/black_copy10.jpg");
		
		//원본파일이 존재하지 않을경우 존재하지 않습니다 출력
		if(file.exists() == false) {
			System.out.println("원본 파일 경로: " + origin);
			System.out.println("복사 파일 경로: " + copy);
			System.out.println("원본파일이 존재하지 않습니다.");
			}
		
		//복사파일 경로에서 디렉토리가 존재하지 않으면 경로상의 모든 디렉토리를 자동생성 할것 
		if(dir.exists() == false) {dir.mkdirs();}
		byte[] buffer = new byte[1024];
		int readCheck = 0;
						
		while( (readCheck = bis.read()) != -1) {
			bos.write(buffer, 0, readCheck);
			
		}
		
		//복사가 성공되었을떄 복사가 성공되었습니다를 출력할 것 
		if(file1.exists() == true) {
			System.out.println("원본 파일 경로: output/black.jpg");
			System.out.println("복사 파일 경로: output/black_copy10.jpg");
			System.out.println("복사가 성공되었습니다.");
			}
		
		
		
		bos.flush();
		bos.close();
		os.close();
		bis.close();
		is.close();
		
		}
}
