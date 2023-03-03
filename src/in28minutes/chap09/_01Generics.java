package in28minutes.chap09;

public class _01Generics {
	// 제네릭스 ->다양한 타입의 객체를 지원하는 인터페이스 메소드 클래스를 정의하는 방법
	// 똑같은 동작하는 메소드 여러번 필요없이 한번만 선언하면 됨
	public static void main(String[] args) {
		Integer[] iArray = { 1, 2, 3, 4, 5 };
		Double[] dArray = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		String[] sArray = { "A", "B", "C", "D", "E" };
		
		printIntArray(iArray);
		printDoubleArray(dArray);
		printStringArray(sArray);
		
		System.out.println("--------");
		
		printAnyArray(iArray);
		printAnyArray(dArray);
		printAnyArray(sArray);
	}
	
	private static <T> void printAnyArray(T[] array) {
		for(T t: array) {
			System.out.print(t + " ");
		}
		System.out.println();
	}
	
	private static void printStringArray(String[] sArray) {
		for(String i : sArray) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}

	private static void printDoubleArray(Double[] dArray) {
		for(double i : dArray) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}

	private static void printIntArray(Integer[] iArray) {
		for(int i : iArray) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	
}
