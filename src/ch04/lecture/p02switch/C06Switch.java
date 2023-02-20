package ch04.lecture.p02switch;

public class C06Switch {
	public static void main(String[] args) {
		// switch case(:) statement - 기존(고전적)
		// switch labeled(->) statement - 화살표 축약 statement

		// switch case(:) expression ->statement의 일부분 어떤 명령문의 일부분이 될 수 있음
		// switch labeled(->) expression
		
		
//		switch case(:) expression
		int val = 3;
		String res = switch (val) {
					case 1: {
						yield "값1"; // 결과를 나타내는 값
					}
					case 2: {
						yield "값2"; //
					}
					case 3: {
						String r = "값" + 1;
						yield r; //
					}
					default: {
						yield "기본 값";
					}
					};
		System.out.println(res);
		
		
		// switch labeled(->) expression
		
//		String res1 = switch (val) {
//		case 1 -> yield "값1";
//		case 2 -> yield "값2";
//		case 3 -> {
//			String r = "값" + val;
//			yield r;
//		}
//		default -> yield "값4";
//		};
//		System.out.println(res1);
		
		String res2 = switch (val) {
		case 1 -> "값";
		case 2 -> "값2";
		case 3 -> {
			String r = "값" + val;
			yield r;
		}
		default -> "기본 값";
		};
		
	}
}
