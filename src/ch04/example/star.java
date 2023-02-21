package ch04.example;

public class star {
	public static void main(String[] args) {
		System.out.println("문제1");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("문제2");
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j < i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		System.out.println("문제3");
		
		for(int i = 0; i < 5; i++) {
			for(int j = i; j >= 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		String[] strlist = {"dfg", "asd"};
		int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++){
            answer[i] = strlist[i].length();
        }
        for (int le : answer) {
        	System.out.println(le);
        }
	}
}

