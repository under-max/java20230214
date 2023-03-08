package ch08.sec05;

public class Television implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		System.out.println("현재 TV볼륨 :" + volume);
	}

}
