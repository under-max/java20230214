package in28minutes.chap09;

public class _03WrapperClass {
	public static void main(String[] args) {
		//래퍼(Wrapper)클래스
		//int double float char - > 객체형태로 만들어서 사용할수 있게 해줌 
		
//		Integer, Float, Character, Double 
		
		Integer i = 123; 
		Double d = 1.0;
		Character c = 'A';
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(c);
		
		System.out.println("------------------");
		
		System.out.println(i.intValue());
		System.out.println(d.intValue());
		System.out.println(c.charValue());
		
		System.out.println("--------------------");
		
		String s = i.toString();
		
	}
}
