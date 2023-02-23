package baekjoon;

import java.util.Scanner;

public class Example10798 {
	public static void main(String[] args) {
//		예제 입력 1 
//		ABCDE
//		abcde
//		01234
//		FGHIJ
//		fghij
//		예제 출력 1 
//		Aa0FfBb1GgCc2HhDd3IiEe4Jj
		
//		예제 입력 2 
//		AABCDD
//		afzz
//		09121
//		a8EWg6
//		P5h3kx
//		예제 출력 2 
//		Aa0aPAf985Bz1EhCz2W3D1gkD6x
//		한 줄의 단어는 글자들을 빈칸 없이 연속으로 나열해서 최대 15개의 글자들로 이루어진다. 
//		또한 만들어진 다섯 개의 단어들의 글자 개수는 서로 다를 수 있다. 
//심심해진 영석이는 칠판에 만들어진 다섯 개의 단어를 세로로 읽으려 한다. 
//		세로로 읽을 때, 각 단어의 첫 번째 글자들을 위에서 아래로 세로로 읽는다.
//		다음에 두 번째 글자들을 세로로 읽는다. 이런 식으로 왼쪽에서 오른쪽으로 한 자리씩 이동 하면서 동일한 자리의
//		글자들을 세로로 읽어 나간다. 위의 그림 1의 다섯 번째 자리를 보면 두 번째 줄의 다섯 번째 자리의 글자는 없다. 
//		이런 경우처럼 세로로 읽을 때 해당 자리의 글자가 없으면, 읽지 않고 그 다음 글자를 계속 읽는다. 
//		그림 1의 다섯 번째 자리를 세로로 읽으면 D1gk로 읽는다. 
		String input = """
				ABCDE
				abcde
				01234
				FGHIJ
				fghij
				""";
		String input1 = """
				AABCDD
				afzz
				09121
				a8EWg6
				P5h3kx
				""";
//		System.out.println(str1.charAt(6));
//		//charAt 5 = " " 
//		String[] arr1 = str1.split("\n");
		
		Scanner scanner = new Scanner(input1);
		
		String[][] whole = new String[5][];
		for(int i = 0; i < 5; i++) {
			whole[i] = scanner.nextLine().split("");
		}
		
	
		//큰길이 구하기 
//		int max = 0;
//		for(int i = 0; i < 5; i++) {
//			if(max < whole[i].length) {
//				max = whole[i].length;
//			}
//		}
//		System.out.println(max);
		
		int numberOfCharacter = 5;
		for(int i = 0; i < numberOfCharacter; i++) {
			for(int j = 0; j < 5; j++) {
				if (i < whole[j].length)
				System.out.print(whole[j][i]);
			}
		}
		
		
		
	}
}
