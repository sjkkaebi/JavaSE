package day05.interfaceEx;


import day05.interfaceEx.mypac.HandPhone;
import day05.interfaceEx.mypac.Phone;
import day05.interfaceEx.mypac.SmartPhone;

/*
 * 객체 설계도 ->
 * class 클래스명 extends 부모클래스명 implements 부모인터페이스명1(여러개 상속 가능), 부모인터페이스명2 {
 * 
 * 		생성자() - 객체가 생성될 때 한 번만 실행된다.
 * 				멤퍼필드 초기화용으로 자주 사용
 * 				리턴이 없다.
 * 				오버로딩 가능
 * 		
 * 		변수(멤버필드) - 속성 - 기본형 참조형, 전역 지역, 정적static 동적
 * 
 * 		메소드(멤버메소드) -기능, 오버로딩 가능 /매개변수, 리턴타입
 * 
 * 		오버라이딩 메소드 - 부모클래스의 메소드로 자식 클래스에서 재정의가 가능하다. 
 * 						추가 정의하고 싶으면 super 예약어 사용으로 가능
 * 						인터페이스일 경우 반드시 재정의(오버라이딩) 해줘야 한다.
 * 
 * 		[[ 접근제어자 ]]
 * 
 *		public - 모든 클래스에서 접근 가능
 * 		protected - 같은 패키지 또는 상속 관계에서 접근 가능
 * 		default(아무것도 안 쓴 것) - 같은 패키지 접근 가능
 * 		private - 같은 클래스 안에서만 접근 가능 
 * 
 * }
 * 
 * [[ 다형성(polymorphism) ]]
 * 
 * 	하나의 객체가 여러가지 타입을 가질 수 있는 것을 의미.
 * 
 */


public class MainClass02 {
	public static void main(String[] args) {
		
		Phone p1 = new HandPhone(); //꼭 import
		p1.call();
		p1.receive();
		
		
		HandPhone p2 = (HandPhone) p1; //캐스팅
		p2.sendMsg();
		
		HandPhone p3 = new HandPhone();
		
		System.out.println(System.identityHashCode(p1));
		System.out.println(System.identityHashCode(p2));
		System.out.println(System.identityHashCode(p3));
		
		Phone p4 = new SmartPhone();
		classifyPhone(p1);
		classifyPhone(p4);
		
	}
	
	public static void classifyPhone(Phone p) {
		if (p instanceof SmartPhone) {
			System.out.println("스마트폰입니다.");}
		else if (p instanceof HandPhone) {
			System.out.println("핸드폰입니다.");
			
		}
	}

}
