package ch07.lecture.p02polymophism;

public class C08Polimophsim {
	public static void main(String[] args) {
		Gun o1 = getGun();
		Weapon o2 = getGun();
		Weapon o3 = getBow();
		Weapon o4 = getSword();
		
		o2.attack();
		o3.attack();
		o4.attack();
		
	}
	
	public static Gun getGun() {
		return new Gun();
	}
	
	public static Bow getBow() {
		return new Bow();
	}
	public static Swrod getSword() {
		return new Swrod();
	}
}
