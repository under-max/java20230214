package ch15.example.exam08;

import java.util.*;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [studentNum=" + studentNum + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		
		return this.studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Student stu) {
			return stu.studentNum == studentNum;
		}else {
			return false;
		}
	}
	
	//코드작성
	
}
