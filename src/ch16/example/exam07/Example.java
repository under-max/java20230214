package ch16.example.exam07;

public class Example {
	private static int[] scores = {10,50,3};
	
	public static int maxOrMin(Operator operator) {
		int result = scores[0];
		for(int score: scores) {
			result = operator.apply(result, score);
		}
		return result;
	}
	
	public static void main(String[] args) {
		//최대값 얻기
		int max1 = maxOrMin((x,y)-> x > y ? x : y);
		int max2 = maxOrMin((x,y)->Math.max(x, y));
		int max3 = maxOrMin(Math::max);
		
		System.out.println("최대값: " + max1);
		System.out.println("최대값: " + max2);
		System.out.println("최대값: " + max3);
		//최소값 얻기
		int min1 = maxOrMin((x,y)-> x < y ? x : y);
		int min2 = maxOrMin((x,y)-> Math.min(x, y));
		int min3 = maxOrMin(Math::min);
		
		System.out.println("최소값: " + min1);
		System.out.println("최소값: " + min2);
		System.out.println("최소값: " + min3);
	}
}
