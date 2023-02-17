package ch03.sec11;

public class Conditional10perationExample {
	public static void main(String[] args) {
		int score = 85;
		char grade = (score > 90) ? 'A' : (score >80) ? 'B' : 'C';
		System.out.println(grade);
		
		char grade1 = (score > 95) ? 'S' : (score > 90) ? 'A' : (score > 85) ?  'B' : (score > 80) ? 'D' : 'E';
		System.out.println(grade1);
	}
}
