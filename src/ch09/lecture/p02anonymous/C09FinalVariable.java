package ch09.lecture.p02anonymous;

public class C09FinalVariable {
	// 로컬 클래스는 감싸고 있는 메소드의
	// 지역변수 (파라미터)를 사용할 수 있다. 
	
	//이때 이 지역 변수(파라미터)는 final 이여야 한다. 
	
	public static void main(String[] args) {
		
		final int i = 10;
		class LocalClass{
			void method1() {
				System.out.println(i);
			}
		}
	}
	public void method1() {
		int i = 20;//effectively final - 묵시적 final 변환이 이루어짐 
		class LocalClass{
			void method2() {
				System.out.println(i);
			}
		}
	}
	
	public void method2(final int param) {
		class LocalClass{
			void method3() {
				System.out.println(param);
			}
		}
	}
	
	public void method3(int param) { //이경우도 effectively final 
		param = 3; //변경할 경우 method4 에서 실행 불가 더이상 final 이 아님 
		class LocalClass {
			void method4() {
				System.out.println(param);
			}
		}
	}
}


