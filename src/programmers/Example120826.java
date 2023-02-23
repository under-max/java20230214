package programmers;

public class Example120826 {
	public static void main(String[] args) {
//		my_string	letter	result
//		"abcdef"	"f"	"abcde"
//		"BCBdbe"	"B"	"Cdbe"
		
		System.out.println(solution("abcdef", "f"));
		
	}
	
	public static String solution(String my_string, String letter) {
        String answer = my_string.replace(letter, "");
        
        return answer;
    }
}
