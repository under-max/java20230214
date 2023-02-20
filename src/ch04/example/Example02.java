package ch04.example;

public class Example02 {
	public static void main(String[] args) {
		String grade = "B";
		int score1 = 0;
		switch (grade) {
		case "A": 
			score1 = 100;
			break;
		case "B":
			int result = 100-20;
			score1 = result;
			break;
		default: 
			score1 = 60;
		}
		System.out.println(score1);
		
		int score2 = switch (grade) {
		case "A" -> score1 = 100;
		case "B" -> {
			int result = 100-20;
			score1 = result;
			yield result;
		}
		default -> score1 = 60;
		
		};
		System.out.println(score2);
		
	}
}