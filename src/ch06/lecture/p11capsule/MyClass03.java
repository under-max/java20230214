package ch06.lecture.p11capsule;

public class MyClass03 {
	//특별한 일 없으면 필드는 private
	
	private String name; 
	private int age;
	private String address;
	private boolean married;
	
	public void setMarried() {
		this.married = married;
	}
	//boolean 타입의 getter은 is로 시작
	public boolean isMarried() {
		return this.married;
	}
		
	//메소드를 public으로 작성 
	public String getName() { //읽는용도전용
		return this.name;
	}
	
	public void setName(String name) { //변경
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
