package ch06.lecture.p08static;

public class CheckConstructorOverloading {
	String name; 
	String model;
	String company;
	int price;
	byte id;
	
	public CheckConstructorOverloading() {}
	
	public CheckConstructorOverloading(String name) {
		this.name = name;		
	}
	public CheckConstructorOverloading(String name, String age) {
		this(name);
		this.model = age;
		
	}
	public CheckConstructorOverloading(String name, String model, String company) {
		this(name, model);
		this.company = company;
	}
	
	public CheckConstructorOverloading(String name, String model, String company, int price) {
		this(name, model, company);
		this.price = price;
		
	}
	
	
}
