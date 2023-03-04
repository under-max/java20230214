package Java.array;

import java.util.*;

public class C05LinkedList {
	public static void main(String[] args) {
		//arrayList -> 누가 들어오려면 한칸씩 떙겨서 일어나서 움직여야함
		//LinkedList -> 그냥 손놓고 새로 들어오는 사람이 양옆사람이랑 맞잡는 느낌 선으로 연결되어있음 
		
		
		ArrayList<String> list2 = new ArrayList<>();
		LinkedList<String> list = new LinkedList<>();
		
		list.add("강호동");
		list.add("유재석");
		list.add("조세호");
		list.add("박명수");
		list.add("유재석");
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		
		System.out.println(list.getFirst()); //처음에 에있는것
		System.out.println(list.getLast()); //마지막에 있는 것
		
		//추가 
		
		list.addFirst("서장훈"); // 제일앞에 추가 
		System.out.println(list.get(0));
		list.add(1, "짜잔");
		System.out.println(list.get(1));
		
		list.remove(list.size()-1);
		System.out.println("---------");
		for(String a : list) {
			System.out.println(a);
		}
		
		Collections.sort(list);
		
		System.out.println("----------");
		for(String a : list) {
			System.out.println(a);
		}
		
	}
}
