package ch11.lecture.p02try_catch;

public class C05MulitipleException {
	public static void main(String[] args) {
		try {
			int[] a = { 0, 1, 2 };
			//ArithmeticException
			//ArrayIndexofException
			int c = 3 / a[0];
			
			//여러 exception 발생할 수 있는 경우
			//여러 catch block 작성 가능 
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("Continue...");
		
	}
}
