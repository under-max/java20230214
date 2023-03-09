package ch12.example.exam05;

import java.util.*;

public class Student {
	private String studentNum;

	public Student(String studentNum) {
		super();
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentNum);
	}

	@Override
	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return Objects.equals(studentNum, other.studentNum);
		
		if(obj instanceof Student target) {
			if(this.studentNum.equals(target.studentNum)) {
				return true;
			}
		}
		return false;
	}
	
	
}
