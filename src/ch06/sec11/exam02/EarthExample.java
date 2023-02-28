package ch06.sec11.exam02;

import java.util.Arrays;

public class EarthExample {
	public static void main(String[] args) {
		System.out.println("지구의 반지름 : " + Earth.EARTH_RADIUS + "km");
		System.out.println("지구의 표면적 : " + Earth.EARTH_SURFACE_AREA + "km^2");
		
		int n =3;
		int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
		int count = 0;
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                count +=1; 
            }
        }
        
        int[] answer = new int[count];
        int j = 0;
        for(int i = 0; i < numlist.length; i++){
            if(numlist[i] % n == 0){
                answer[j] = numlist[i]; 
                j += 1;
            }
        }
		
		
	}
}
