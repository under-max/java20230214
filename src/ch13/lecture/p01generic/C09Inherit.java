package ch13.lecture.p01generic;

public class C09Inherit {
	public static void main(String[] args) {
		
	}
}

//제네릭타입 상속
class Super09<T>{}
class Sub09<T> extends Super09<T>{}

class Super10<T, U>{}
class Sub10<T, U> extends Super10<T, U>{}

class Super11<T> {}
class Sub11 extends Super11<String> {}

class Super12<T, U> {}
class Sub12<T> extends Super12<T, String> {} //구체적으로 하나 묘사해서 하나 빼도됨 다 묘사하면 두개다 생략 가능

class Super13<T> {}
class Sub13<T, U> extends Super13<T> {}

class Super14<T extends Number> {}
class Sub14<T extends Integer> extends Super14<T> {} //자식은 같은타입이나 하위타입으로 제한

