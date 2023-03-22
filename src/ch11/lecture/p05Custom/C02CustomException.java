package ch11.lecture.p05Custom;

public class C02CustomException {
	public static void main(String[] args) throws Exception {
		Exception e = new Exception();
		Exception e2 = new Exception("some message"); //parameter 1개갖는 녀석 던지면 String 같이 출력됨 
		
		System.out.println(e.getMessage());
		System.out.println(e2.getMessage());
		
		throw e2;
	}
}
