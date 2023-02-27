package in28minutes.collections;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {
	public static void main(String[] args) {
		List<Character> character = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
		
		Set<Character> character1 = new TreeSet<>(character); 
		
		System.out.println(character1);
	}
}
