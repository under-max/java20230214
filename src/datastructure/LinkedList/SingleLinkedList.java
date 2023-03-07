package datastructure.LinkedList;

public class SingleLinkedList {
	private Node head;
	SingleLinkedList(){
		this.head = null;
	}
	
	SingleLinkedList(int value){
		this.head = new Node(value, null);
	}

	class Node {
		private int value; //값
		private Node next;//포인터
		
		
		Node(int value, Node next){
			this.value = value;
			this.next = next;
		}
		
		public int getValue() {
			return this.value;
		}
	}
public Node getHead() {
	return this.head;
}

public void append(int value) {
	if (this.head == null) {
		this.head = new Node(value, null);
		return;
	}
}

}

