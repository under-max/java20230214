package ch07.lecture.p03cast;

public class C08Instanceof {
	public static void main(String[] args) {
		Super08 o1 = new Sub08();
		
		if(o1 instanceof Sub08) {
			Sub08 o2 = (Sub08) o1;
			//o2의 메소드 실행... 
		}
		
		//patter matching for instance of 
		if(o1 instanceof Sub08 o2) {
						
			//o2의 메소드 실행... 
		}
	}
}

class Super08 {}
class Sub08 extends Super08 {}
