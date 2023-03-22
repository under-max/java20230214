package ch11.lecture.p02try_catch;

public class C04PrintStackTrace {
	public static void main(String[] args) {
		//unchecked exception
		try {
			String a = "java";
			System.out.println(a.charAt(4)); //Unchecked exception
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("aa");
		
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
