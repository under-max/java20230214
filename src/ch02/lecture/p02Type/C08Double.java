package ch02.lecture.p02Type;

public class C08Double {
	public static void main(String[] args) {
		//실수 
		//float(4byte = 32bites) double(8bytes = 64bites)
		
		int i1 = 3;
//		i1 = 3.14; integer 값에는 실수값 배정 불가능
	    double d1 = 3.14;
	    d1 = 99.9999;
	    d1 = 3;
	    
	    float f1 = 3.14F;
	    f1 = 3; //이건 정수니까 가능
	    
	    //사용시 주의 
	    //10진법 -> 2진법으로 바꿔서 저장하기 떄문에 근사값으로 저장 
	    double d2 = 0.1;
	    double d3 = 0.2;
	    
	    double d4 = d2 + d3;
	    System.out.println(d4); //result 0.3000000000000000004
	}
}
