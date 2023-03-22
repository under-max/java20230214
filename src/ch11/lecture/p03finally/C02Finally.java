package ch11.lecture.p03finally;

public class C02Finally {
	public static void main(String[] args) {
		
		try {
			int d = 1; 
			boolean a = true;
			
			if(a) {
				return;
			}
				
			System.out.println("try block..");
							
		} catch (NullPointerException e) {
			e.printStackTrace();
		} finally {
			//심지어 리턴 되어도 실행되는 블럭 
			System.out.println("finally block");
		}
		
		
	}
}
