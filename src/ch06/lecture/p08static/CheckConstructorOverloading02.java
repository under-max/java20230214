package ch06.lecture.p08static;

public class CheckConstructorOverloading02 {
	String name; 
	String model;
	String company;
	int price;
	byte id;
	
	public CheckConstructorOverloading02() {}
	
	public CheckConstructorOverloading02(String name) {
		this(name, null, null, 0);		
	}
	public CheckConstructorOverloading02(String name, String model) {
		this(name,model,null, 0);		
	}
	public CheckConstructorOverloading02(String name, String model, String company) {
		this(name, model, company, 0);		
	}
	
	public CheckConstructorOverloading02(String name, String model, String company, int price) {
		this.name = name;
		this.model = model;
		this.company = company;
		this.price = price;		
	}
}
