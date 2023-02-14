package ch02.sec01;

public class VarialbleUseExample {
	public static void main(String[] args) {
		int muHour = 3;
		int minute2 = 5; // 컨트롤 + 1누르면 변수명 한꺼번에 변경 가능
		System.out.println(muHour + " 시간 " + muHour + "분");

		int totalMinute = (muHour * 60) + minute2;
		System.out.println("총 " + totalMinute + " 분");
	}
}
