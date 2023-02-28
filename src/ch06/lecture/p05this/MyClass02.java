package ch06.lecture.p05this;

public class MyClass02 {
	//instance field
	String name; 
	
	//instance method
	void printName() {
		String name = "park";
		System.out.println(name); //this 안붙이면 lv 붙이면 iv
		System.out.println(this.name); //this 안붙이면 lv 붙이면 iv
		
		
	}

	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}
}
