package ch17.lecture.p03intermediate;

import java.util.*;

public class C18Sorted {
	public static void main(String[] args) {
		List<Car> car = List.of(
				new Car("genesis", 7000),
				new Car("avante", 2500),
				new Car("tesla", 5000),
				new Car("morning", 1500)
				);
		
		car.stream()
		.sorted()
		.forEach(System.out::println);
		
		System.out.println();
		
		car.stream()
		.sorted((a,b)-> a.getName().compareTo(b.getName()))
		.forEach(System.out::println);
		
		System.out.println();
		
		//역순
		
		car.stream()
		.sorted((a,b)-> b.getPrice() - a.getPrice())
		.forEach(System.out::println);
		System.out.println();
		car.stream()
		.sorted((a,b)-> b.getName().compareTo(a.getName()))
		.forEach(System.out::println);
		
		
		System.out.println();
		car.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
	}
}


//getter 생성자 toString
class Car implements Comparable<Car>{
	String name;
	int price;
	public Car(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}
	
	@Override
	public int compareTo(Car o) {
		
		return this.price - o.price;
	}
}
