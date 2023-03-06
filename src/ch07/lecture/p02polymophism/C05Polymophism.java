package ch07.lecture.p02polymophism;

public class C05Polymophism {
	public static void main(String[] args) {
		Hero hero = new Hero();
		//..진행..
		
		hero.weapon = new Gun();
		hero.button1();
		
		hero.weapon = new Bow();
		hero.button1();
		
		hero.weapon = new Swrod();
		hero.button1();
	}
}

class Swrod extends Weapon{
	@Override
	public void attack() {
		System.out.println("검을 휘두릅니다.");
	}
}

class Bow extends Weapon{
	@Override
	public void attack() {
		System.out.println("활을 쏩니다");
	}
}

class Hero {
	public Weapon weapon;
	public void button1() {
		weapon.attack();
	}
}

class Weapon{
	public void attack() {
		System.out.println("공격합니다");
	}
}

class Gun extends Weapon {
	@Override
	public void attack() {
		System.out.println("총으로 공격합니다.");
	}
}
