package ch12.lecture.p01object;

public class C08Record {
	public static void main(String[] args) {
		MyClass08 o1 = new MyClass08("son", 11);
		
		System.out.println(o1);
		System.out.println(o1.toString());
	}
}

class MyClass08{
	private final String name;
	private final int age;
	
	
	public MyClass08(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "MyClass08 [age=" + age + ", name=" + name + "]";
	}
}