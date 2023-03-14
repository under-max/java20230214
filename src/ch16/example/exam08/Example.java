package ch16.example.exam08;

public class Example {
	private static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
	};
	
	//avg()메소드 작성
	private static double avg(Function<Student> function) {
		int sum = 0;
		for(Student student : students) {
			sum += function.apply(student); //apply ->  s.getEnglishScore()
				
			System.out.println(student.getEnglishScore());
			System.out.println(function.apply(student));//double type function.apply(s)
			
		}
		double avg = sum / students.length;
		return avg;
	}
	
	
	public static void main(String[] args) {
	   		
//		double englishAvg = avg(s -> s.getEnglishScore()); 
		double englishAvg = avg(Student::getEnglishScore); 
		
		System.out.println("영어 평균 점수: " + englishAvg);
		
//		double mathAvg = avg(s-> s.getMathScore());
		double mathAvg = avg(Student::getMathScore);
		System.out.println("수학 평균 점수: " + mathAvg);
		
		
	}


}
