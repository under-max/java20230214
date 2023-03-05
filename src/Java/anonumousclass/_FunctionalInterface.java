package Java.anonumousclass;

import Java.anonumousclass.converter.*;

public class _FunctionalInterface {
	public static void main(String[] args) {
		KRWConverter converter = new KRWConverter();
		
//		converter.convert(1);
//		converter.convert(2);
		
		convertUSD (USD -> System.out.println(USD + " 달러 = " + (USD * 1400) + "원"), 5);
	}
	
	public static void convertUSD(Converterble converter, int USD) {
		converter.convert(USD);
	}
	
}
