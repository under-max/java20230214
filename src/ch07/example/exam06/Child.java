package ch07.example.exam06;

public class Child extends Parent{
	public int studentNo;
	
	public Child(String name, int studentNo) {
		super(name); //이미 super생성자는 String name의 값을 받음 
//		this.name = name;
		this.studentNo = studentNo;
	}
}
