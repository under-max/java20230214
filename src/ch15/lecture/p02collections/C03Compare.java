package ch15.lecture.p02collections;

import java.util.*;

public class C03Compare {
	public static void main(String[] args) {
		List<Person03> list = new ArrayList<>();
		list.add(new Person03("cha", 50));
		list.add(new Person03("son", 30));
		list.add(new Person03("park", 40));
		list.add(new Person03("kim", 40));
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}

class Person03 implements Comparable<Person03>{
	private String name;
	private int age;
	
	
	
	public Person03(String name, int age) {
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
		return "Person03 [name=" + name + ", age=" + age + "]";
	} 
	
	@Override
	public int compareTo(Person03 o) {
//		return this.age - o.age;
//		return this.name.compareTo(o.name); 나이순
		
		int ageDiff = this.age - o.age;
		if(ageDiff == 0) {
			return this.name.compareTo(o.name);
		}
		return ageDiff;
	}
	
	
}
