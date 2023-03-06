package ch07.lecture.p02polymophism;

public class C09Polymophism {
	public static void main(String[] args) {
		Weapon o1 = new Gun();
		Weapon o2 = new Bow();
		Weapon o3 = new Swrod();
		
		Gun[] o4 = new Gun[3];
		o4[0] = new Gun();
		o4[1] = new Gun();
		o4[2] = new Gun();
		
		Weapon[] o5 = new Weapon[5];
		o5[0] = new Weapon();
		o5[1] = new Gun();
		o5[2] = new Bow();
		o5[3] = new Swrod();
		
		o5[0].attack();
		o5[1].attack();
		o5[2].attack();
		o5[3].attack();
		
	}
}
