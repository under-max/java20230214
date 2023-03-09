package ch13.lecture.p01generic;

import java.lang.reflect.*;

public class C06GenericMethod {
	public static void main(String[] args) {
		MyClass06 o1 = new MyClass06();
		o1.<String>method();
		o1.<Integer>method();
		
		String s1 = o1.<String>method();
		Integer s2 = o1.<Integer>method();
		

		String s3 = o1.method();
		Integer s4 = o1.method();
		
		int[] array = {1, 2, 3, 3, 3, 4};
		int answer = 0;
        int count = 0;
        int[] array1 = new int[array.length];
        for(int i =0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i] == array[j]){
                	count += 1;
                    array1[i] = count;
                 }
            }
            count = 0;
        }
        
        int max = 0;
        for(int i = 0; i < array1.length; i++) {
        	if(max < array1[i]) {
        		max = array1[i];
        	}
        }
        
        System.out.println(max);
        
	}
}

class MyClass06 {
	public <T> T method() {
		return null;
	}
}