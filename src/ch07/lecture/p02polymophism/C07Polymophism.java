package ch07.lecture.p02polymophism;

public class C07Polymophism {
	public static void main(String[] args) {
		Hero hero = new Hero();
		// ..진행.. 무기선택

		Weapon w = getWeapon(1);
		hero.weapon = w;
		
		hero.button1();

	}

	public static Weapon getWeapon (int choice) {
		switch (choice) {
			case 1 -> {
				return new Gun();
			}
			case 2-> {
				return new Bow();
			}
			case 3-> {
				return new Swrod();
			}
		}
		
		return new Weapon();
	}
}
