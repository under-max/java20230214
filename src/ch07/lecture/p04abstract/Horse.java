package ch07.lecture.p04abstract;

public class Horse extends Animal{
	
	//추상메소드는 꼭 재정의 되어야 함
	@Override
	public void breath() {
		System.out.println("폐로 호흡합니다.");
	}
}
