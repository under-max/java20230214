package ch11.lecture.p04throw;

public class C07Throw {
	public static void main(String[] args) {
		try {
			method1();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("continue");
	}
	}
	
	public static void method1() throws ClassNotFoundException{
		
	}
}
