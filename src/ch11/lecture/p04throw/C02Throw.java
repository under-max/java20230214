package ch11.lecture.p04throw;

public class C02Throw {
	public static void main(String[] args) {
		
		try {
			method1();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void method1() throws Throwable{
		throw new Exception();
	}
}
