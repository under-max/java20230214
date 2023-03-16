package ch15.example.exam10;

import java.util.*;

public class Student implements Comparable<Student>{
	public String id;
	public int score;
	
	public Student(String id, int score) {
		super();
		this.id = id;
		this.score = score;
	}
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(id, score);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return Objects.equals(id, other.id) && score == other.score;
//	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.score - o.score;
	}
}
