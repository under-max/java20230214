package ch07.lecture.p03cast;

public class C01Cast {
	public static void main(String[] args) {
		//형변환
		Animal a1 = new Horse();
		a1.breath();
		
		Horse h1 = (Horse) a1; //강제 형변환
		h1.run();
		
		Animal a2 = new Fish();
		a2.breath();
		
		Fish f1 = (Fish) a2; //강제 형변환 type casting 
		f1.swim();
	}
}

class Fish extends Animal{
	@Override
	public void breath() {
		System.out.println("아가미 호흡한다");
	}
	
	public void swim() {
		System.out.println("헤엄칩니다.");
	}
}

class Horse extends Animal{
	@Override
	public void breath() {
		System.out.println("페호흡한다");
	}
	
	public void run() {
		System.out.println("달립니다.");
	}
}

class Animal {
	public void breath() {
		System.out.println("호흡한다");
	}
}


