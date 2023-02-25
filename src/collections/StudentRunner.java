package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {
	public static void main(String[] args) {
		
		List<Student> students = List.of(new Student(1, "Ranga"), new Student(100, "Adam"), new Student(2, "Eve"));
				
		System.out.println(students);
		
		ArrayList<Student> studentAl = new ArrayList<>(students);
		System.out.println(studentAl);
		
		Collections.sort(studentAl);
		System.out.println(studentAl);
	}
}
