package ch08.example.exam05;

public class Tv implements Remocon{
	
	
	@Override
	public void powerOn() {
		System.out.println("Tv를 켰습니다.");
	}
	
	public static void main(String[] args) {
		Remocon r = new Tv();
		r.powerOn();
	}
}
