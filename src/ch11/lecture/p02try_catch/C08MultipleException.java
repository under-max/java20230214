package ch11.lecture.p02try_catch;

public class C08MultipleException {
	public static void main(String[] args) {
		try {
			
			//여러 exception 발생 가능
//		} catch (RuntimeException e) { //아래 catch 블럭의 exception보다 상위 타입의 exception catch 블럭을 사용할 수 없다.
//			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (ClassCastException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
