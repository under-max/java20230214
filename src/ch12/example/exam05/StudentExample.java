package ch12.example.exam05;

import java.util.HashSet;

public class StudentExample {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		
		//Student 저장
		hashSet.add(new Student("1"));
		hashSet.add(new Student("1")); //같은 학번이므로 중복저장이 안됨
		hashSet.add(new Student("2"));
		
		System.out.println("저장된 student 수" + hashSet.size());
	}
}
