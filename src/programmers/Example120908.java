package programmers;

public class Example120908 {
	public static void main(String[] args) {
//			str1					str2	result
//		"ab6CDE443fgh22iJKlmn1o"	"6CD"		1
//		"ppprrrogrammers"			"pppp"		2
//		"AbcAbcA"					"AAA"		2
		System.out.println(solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
		
	}
	
	
	
	
	 public static int solution(String str1, String str2) {
	        int answer = str1.contains(str2) ? 1 : 2;
	        return answer;
	    }
	 
	 
}

