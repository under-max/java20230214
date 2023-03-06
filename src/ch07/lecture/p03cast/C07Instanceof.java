package ch07.lecture.p03cast;

public class C07Instanceof {
	public static void main(String[] args) {
		action(new Animal());
		action(new Horse());
		action(new Fish());
	}
	
	public static void action(Animal a) {
		a.breath();
		
		//말이면 run();
		if(a instanceof Horse) {
			((Horse) a).run();
		}else if(a instanceof Fish) {
			Fish f = (Fish) a;
			f.swim();
		} else {
			System.out.println("말도 물고기도 아닙니다.");
		}
		
		
		//물고기면 swim 메소드 실행
		
		
	}
}
