package ch15.sec03.exam02;

import java.util.*;

public class Member {
	public String name;
	public int age;
	public Member(String name, int age) {
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
		return "Member [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
}
