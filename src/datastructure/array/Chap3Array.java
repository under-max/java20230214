package datastructure.array;

import java.util.Arrays;

public class Chap3Array {
	public static void main(String[] args) {
		String[] foldeA = {"myComputer", "myDocument", "recycleBin"};
		
		System.out.println("clone() 메서드 호출");
		
		String[] folderB = foldeA.clone();
		folderB[0] = "newFolder";
		
		System.out.println("원본배열 : " + Arrays.toString(foldeA));
		System.out.println("사본배열 : " + Arrays.toString(foldeA));
		
		System.out.println("system.arraycopy메서드 호출");
		
		String[] folderC = new String[foldeA.length];
		System.arraycopy(foldeA, 0, folderC, 0, 2);
		folderC[0] = "newFolder";
		
		System.out.println("원본 배열 : " + Arrays.toString(foldeA));
		System.out.println("사본 배열 : " + Arrays.toString(folderC));
		
		System.out.println("array.copy 메서드 호출");
		
		String[] folderD = new String[foldeA.length];
		Arrays.copyOf(foldeA, 1);
		
		folderD[0] = "newFOlder";
		System.out.println("원본 배열" + Arrays.toString(foldeA));
		System.out.println("사본 배열" + Arrays.toString(folderD));
		
		
		
 	}
}
