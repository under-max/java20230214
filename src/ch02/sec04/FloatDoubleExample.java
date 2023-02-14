package ch02.sec04;

public class FloatDoubleExample {
	public static void main(String[] args) {
		//정밀도 확인
		float var1 = 0.1234567890123456789f;
		double var2 = 0.1234567890123456789; //double 타입이 float 보다 2배더 긴 유료자릿수를 가짐 
//		double 이라는 이름이 float 보다 2배더 높은 정밀도를 갖는다는 의미에서 붙여짐 
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		
		//10의 거듭제곱 리터럴
		double var3 = 3e6; //3*10의 6승
		float var4 = 3e6F; //3*10의 6승
		double var5 = 2e-3; //2*10-3승
		
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
	}
}
