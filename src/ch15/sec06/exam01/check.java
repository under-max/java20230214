package ch15.sec06.exam01;

import java.util.*;

public class check {
	public static void main(String[] args) {
		 Map<Integer, Integer> map = new HashMap<>();
	        int[] array = {1, 2, 3, 3, 3, 4};
//	        array = {1, 1, 2, 2}; , {1}
	        for(int a : array){
	            map.putIfAbsent(a, 0);
	            int befValue = map.get(a);
	            map.replace(a, befValue+1);
	        }
	        List<Integer> value = new ArrayList<>();
	        List<Integer> key = new ArrayList<>();
	        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
	            int x = entry.getValue();
	            int y = entry.getKey();
	            value.add(x);
	            key.add(y);
	        }
	        
	        int max = 0;
	        int index = 0;
	        System.out.println(value.get(0));
	        for(int i = 0; i < value.size(); i++){
	        	    if(max < value.get(i)){
	                max = value.get(i);
	                index = i;
	            }
	            
	        }
	        value.remove(index)
	        for(int i = 0; i < value.size(); i++) {
	        	if(max < value.get(i)){
	        		System.out.println(-1);
	        	}
	        }
	        
	          
	        
	       System.out.println(key.get(index));
	}
}
