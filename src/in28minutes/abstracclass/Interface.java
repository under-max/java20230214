package in28minutes.abstracclass;

import in28minutes.abstracclass.reporter.*;

public class Interface {
	public static void main(String[] args) {
		//인터페이스 -뼈만있음
		NormalReporter normalReporter = new NormalReporter();
		normalReporter.report();
		VideoReporter videoReporter = new VideoReporter();
		videoReporter.report();
	}
}
