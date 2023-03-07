package ch07.lecture.p07sealed;

public class C02Sealed {

}

//상속받은 클래스는 다시 sealed로 선언 가능 
sealed class Super02 permits Sub021 {}

sealed class Sub021 extends Super02 permits Sub022{}

final class Sub022 extends Sub021{}
