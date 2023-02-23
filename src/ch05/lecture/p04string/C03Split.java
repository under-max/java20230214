package ch05.lecture.p04string;

public class C03Split {
	public static void main(String[] args) {
		//split 
		//특정 문자 패턴으로 문자열을 나누어서 배열로 리턴;
		
		
		String str1 = "Hello,Java,World,html,css";
		str1.split(","); //배열로 반환
		String[] arr1 = str1.split(",");
		
		System.out.println(arr1.length);
		for(String ar : arr1) {
			System.out.println(ar);
		}
		System.out.println("--------------------------------");
		String str2 = "spring react vue angulat jsp sass";
		String[] arr2 = str2.split(" ");
		System.out.println(arr2.length);
		for(String ar : arr2) {
			System.out.println(ar);
		}
		
		System.out.println("-------------------------------");
		for(String ar : arr2) {
			System.out.print(ar + " ");
		}
		
		System.out.println("-------------------------------");
		
		String str3 = "i'm ironman.";
		String[] arr3 = str3.split("");
		System.out.println(arr3.length);
		for(String a : arr3) {
			System.out.println(a);
		}
		System.out.println("-------------------------------");
	}
}
