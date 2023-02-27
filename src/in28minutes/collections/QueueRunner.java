package in28minutes.collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthCOmparator implements Comparator<String>{

	@Override
	public int compare(String value1, String value2) {
		// TODO Auto-generated method stub
		return Integer.compare(value1.length(), value2.length());
	}
	
}

public class QueueRunner {
	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>(new StringLengthCOmparator());
		queue.addAll(List.of("Zebra", "Monkey", "Cat"));
		
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		
	}
}
