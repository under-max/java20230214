package ch12.lecture.p02wrapper;

public class C02Wrapper {
	public static void main(String[] args) {
		int i1 = 3;
		System.out.println(i1);
		
		Integer o1 = i1; //현재버전
		Integer o2 = new Integer(i1);//예전버전
		
		Integer o3 = Integer.valueOf(i1); //지금버전 포장, boxing (권장)
		
		Number o4 = i1; // auto boxing,자동 형변환
		Object o5 = o4; // auto boxing,자동 형변환
		
	}
}
