package ch12.example.exam08;

public class exam08 {
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		int[] scores = new int[1000];
		for(int i = 0; i < scores.length; i++) {
			scores[i] = i;
		}
		
		int sum = 0;
		
		for (int score: scores) {
			sum += score;
		}
		
		double avg = sum / scores.length;
		System.out.println(avg);
		
		long endTime = System.nanoTime();
		System.out.println("걸린시간 : " + (endTime - startTime));
	}
}
