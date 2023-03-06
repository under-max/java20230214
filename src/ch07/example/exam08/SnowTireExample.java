package ch07.example.exam08;

public class SnowTireExample {
	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = new Tire();
		
		snowTire.run();
		tire.run();
		
		TireRunner runner = new TireRunner();
		runner.tire = snowTire;
		runner.method1();
		
		runner.tire = tire;
		runner.method1();
		
		runner.method1(snowTire);
		runner.method1(tire);
		
		runner.method1(new SnowTire());
		runner.method1(new Tire());
	}
}
