package ch17.exameple.exam08;

import java.util.*;

public class Example1 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자")
				);

		
		
		Map<String, List<Member>> map = new HashMap<>();
		//key = 개발자 , value = Member 
		for(Member member : list) {
			List<Member> val = map.get(member.getJob());
			if(val == null) {
				val = new ArrayList<>();
				map.put(member.getJob(), val);
			}
			val.add(member);
		}
		System.out.println("[개발자]");
		List<Member> dev = map.get("개발자");
		for(Member d : dev) {
			System.out.println(d);
		}
		
		
		System.out.println();
		
		System.out.println("[디자이너]");
		List<Member> val2 = map.get("디자이너");
		for(Member d :val2) {
			System.out.println(d);
		}
		
		System.out.println("전체");
		
		for(var entry : map.entrySet()){
			System.out.println(entry.getKey() + " : " + entry.getValue());
			
		}
	

//		for(String s : list) {
//			Integer key = s.length();
//			List<String> val = r2.get(key);
//			
//			if(val == null) {
//				val = new ArrayList<>();
//				r2.put(key, val);
//			}else {
//				val.add(s);
//			}
//		}
		
		
		
		
		
//		Map<String, List<Member>>
//		Map<String, List<Member>> g
//		개발자
//		name:홍길동, job 개발자
//		name:신용권, job 개발자
		
		
//		디자이너
//		name:김나리 job: 디자이너
	}
}
