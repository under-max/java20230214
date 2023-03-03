package in28minutes.abstracclass;

import in28minutes.abstracclass.camera.*;

public class _01AbstractClass {
	//데이터 추상화
	//abstract 
	//추상클래스 (아직 완성되지 않은 클래스) -> 상속해서 구체적 동작을 명시해야 가능함
	//추상메소드 (추상클래스에서만 사용 가능한 껍데기만 있는 메소드)
	
	public static void main(String[] args) {
//		Camera camera = new Camera(); //추상클래스라 바로 상속 불능
		FactoryCam factoryCam = new FactoryCam();
		factoryCam.showMainFeature();
		SpeedCam speedCam = new SpeedCam();
		speedCam.showMainFeature();
	}
}
