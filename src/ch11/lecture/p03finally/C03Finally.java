package ch11.lecture.p03finally;

public class C03Finally {
	public static void main(String[] args) {
		try {
			
			boolean a = true;
			
			if(a) {
				return;
			}
				
			System.out.println("try block..");
							
		} finally {
			//심지어 리턴 되어도 실행되는 블럭 
			System.out.println("finally block");
		}  
		
		System.out.println("Continue.....");
	}
}
