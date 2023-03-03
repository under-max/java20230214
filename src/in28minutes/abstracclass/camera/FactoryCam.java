package in28minutes.abstracclass.camera;

public class FactoryCam extends Camera{

	@Override
	public void showMainFeature() {
		System.out.println("화제감지");
		
	}
	
	public void detect() {
		System.out.println("화제를 감지합니다");
	}
	
	public void report() {
		System.out.println("화제신고를 진행 합니다");
	}
	
}
