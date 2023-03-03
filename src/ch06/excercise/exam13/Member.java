package ch06.excercise.exam13;

public class Member {
	private String name;
	private String id;
	private String password;
	private int age;
	private boolean married;
	
	public Member() {
		
	}
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassWord() {
		return this.password;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
}
