package ch04.sec02;

public class aavxdfg {
	public static void main(String[] args) {
		int numer1 = 1;
		int denom1 = 2;
		int numer2 = 3;	
		int denom2 = 4;	
		
		
		int numer = (numer1 * denom2) + (numer2 * denom1);
		int denom = (denom1 * denom2);
		System.out.println(numer);
		System.out.println(denom);
		int gcd = 0;
		for(int i = 1; i <= numer && i <= denom; i++) {
			if(numer % i == 0 && denom % i == 0) {
				gcd = i;
			}
		}
		
		numer = numer / gcd;
		denom = denom / gcd;
		System.out.println(numer);
		System.out.println(denom);
		int[] answer = {numer, denom};
		
		
		
//		return answer;
		
		
		
		
		
//		int newDenom1 = newDenom % 2 == 0 ? newDenom / 2 : newDenom % 3 == 0 ? newDenom / 3 : newDenom;
//		int newNumer3 = newDenom % 2 == 0 ? newNumer1 / 2 : newDenom % 3 == 0 ? newNumer1 / 3 : newNumer1;
//		int newNumer4 = newDenom % 2 == 0 ? newNumer2 / 2 : newDenom % 3 == 0 ? newNumer2 / 3 : newNumer2;
		
//        int gcd = 0;
//        int min = (denom1 < denom2) ? denom1 : denom2;
//        for(int i = 1; i < min; i++) {
//        	if(denom1 % i == 0 && denom2 % i == 0) {
//        		gcd = i;
//        	}
//        		
//        }
//        
//        int new_Denom1 = 0;
//        int new_Numer1 = 0;
//        int new_Numer2 = 0;
//        
//        if (denom1 == denom2) {
//        	new_Denom1 = denom1;
//        	new_Numer1 = numer1;
//        	new_Numer2 = numer2;
//        }
//        else if (gcd == 1) {
//        	new_Denom1 = denom1 * denom2;
//        	new_Numer1 = numer1 * denom2;
//        	new_Numer2 = numer2 * denom1;
//        }
//        if (denom1 > denom2) {
//        	new_Denom1 = denom1 % denom2 == 0 ? (denom1 / denom2)* denom2 : (denom1 * denom2) / gcd;
//        	new_Numer1 = denom1 % denom2 == 0 ? numer1 : numer1 * (((denom1 * denom2) / gcd)/denom1);
//        	new_Numer2 = denom1 % denom2 == 0 ? numer2 * (denom1 / denom2) : numer2 * (((denom1 * denom2) / gcd)/denom2);
//        }
//        
//        if (denom1 < denom2) {
//        	new_Denom1 = denom2 % denom1 == 0 ? (denom2 / denom1)* denom1 : (denom1 * denom2) / gcd;
//        	new_Numer1 = denom2 % denom1 == 0 ? numer1 * (denom2 / denom1) : numer1 * (((denom2 * denom1) / gcd)/denom1);
//        	new_Numer2 = denom2 % denom1 == 0 ? numer2 : numer2 * (((denom1 * denom2) / gcd)/denom2);
//        }
//        
//        
//        int result = new_Numer1 + new_Numer2;
//        int result1 = new_Denom1;
//        
//        System.out.println(new_Denom1);
//        System.out.println(new_Numer1);
//        System.out.println(new_Numer2);
//        System.out.println(result);
//        
//        int[] answer = {result, result1}; 
//        
//        System.out.println(answer);
//        System.out.println(result1);
    }

	}
	
	

