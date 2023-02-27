package ch05.lecture.p09main;

public class C01MainArgument {
	public static void main(String[] args) {
		//play without argument
		//java C01MainArguments
		
		//argument 전달 실행
		//java C01MainArguements Hello Java -> 여러문자열
		System.out.println("명령문들....");
		System.out.println(args.length);
		System.out.println(args[0]);
		System.out.println(args[1]);
	}
}
