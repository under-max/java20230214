package ch06.excercise.exam13;

public class MemberExample {
	public static void main(String[] args) {
		Member o1 = new Member();
		Member user1= new Member("홍길동", "hong");
		o1.setName("김자바");
		o1.setId("김자바12");
		o1.setPassword("123456");
		o1.setAge(999);
		
		System.out.println(o1.getName());
		System.out.println(o1.getId());
		System.out.println(o1.getPassWord());
		System.out.println(o1.getAge());
	}
}
