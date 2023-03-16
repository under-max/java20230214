package ch15.example.leetcode.solution844;

import java.util.*;

public class Solution844 {
	public boolean backspaceCompare(String s, String t) {
		Stack<String> stack1 = new Stack<>();
		Stack<String> stack2 = new Stack<>();
		
		String[] check1 = s.split("");
		String[] check2 = t.split("");
		
		for(int i = 0; i < check1.length; i++) {
			if(check1[i].equals("#")) {
				stack1.pop();
			} else {
				stack1.push(check1[i]);
			}
		}
		
		for(int i = 0; i < check2.length; i++) {
			if(check2[i].equals("#")) {
				stack2.pop();
			} else {
				stack2.push(check1[i]);
			}
		}
		
		String stackA = "";
		String stackB = "";
		
		while(!stack1.isEmpty()) {
			stackA += stack1.pop();
		}
		
		while(!stack2.isEmpty()) {
			stackB += stack2.pop();
		}
		return stackA.equals(stackB);
	}
}
