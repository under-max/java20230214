package ch15.lecture.p05stack;

import java.util.*;

public class C01Stack {
	public static void main(String[] args) {
		//Lifo (Last in First Out)
		//주요메소드 
		//push 넣기 
		//pop 꺼내기
		
		Stack<String> stack = new Stack<>();
		
		stack.push("backho");
		stack.push("chisoo");
		stack.push("taesup");
		stack.push("daeman");
		stack.push("taewoong");
		
		System.out.println(stack.size());
		
		String s1 = stack.pop();
		System.out.println(s1);
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
		System.out.println(stack.size());
	}
}
