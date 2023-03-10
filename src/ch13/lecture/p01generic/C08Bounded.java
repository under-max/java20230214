package ch13.lecture.p01generic;

public class C08Bounded {
	public static void main(String[] args) {
		MyClass08<Integer> o1 = new MyClass08<>(99);
		o1.handleItem();
		
		MyClass08<Double> o2 = new MyClass08<>(3.14);
		o2.handleItem();
		
//		MyClass08<String> o3 = new MyClass08<>("d"); 안됨 String 은 Number의 하위타입이 아님 
	}
}
//bounded type Parameter
class MyClass08<T extends Number>{
	private T item;

		
	public MyClass08(T item) {
		this.item = item;
	}

	
	public void handleItem() {
		String str = item.toString();
		int hash = item.hashCode();
		boolean eq = item.equals(null);
		
		//Int와 Double은 Number의 하위타입이므로 Number의 method를 실행할 수 있음 
		int i1 = item.intValue();
		double d1 = item.doubleValue();
		
	}
	
	
	
}
