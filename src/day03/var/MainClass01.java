package day03.var;

/*
 * [[변수(variable)]]
 * 
 * 1. 타입에 따른 변수
 * 		기본형 - 예약어 소문자로 시작하고 값을 가지고 있다.
 * 				ex) 8가지 boolean, byte, short, int, long, char, float, double
 * 		참조형 - 대문자로 시작하고 주소 값을 가지고 있다. 객체
 * 				기본형 외 나머지 전부!!! 
 * 				ex) String
 * 2. 선언 위치에 따른 변수
 *		전역변수(global 변수) - 클래스 안에 선언
 		지역변수 - 메소드 또는 생성자 {} 괄호 안에 선언
 * 3. 정적/동적 변수 
 * 		static- JVM Method area 또는 Static area에 올라가는 변수
 * 				보통 공통값을 대입.
 * 		동적 - static 외 전부!!!
 * 			  동적인 값 대입.
 */

public class MainClass01 {
	String golbalStr = "전역변수";
	public static void main(String[] args) {
//		MainClass01 m1 = new MainClass01();
//		System.out.println(m1.golbalStr); //class 를 객체화 시켜서 메인메소드 안에 올릴 수 있게 됨.(메모리에 값이 올라가 있어야 함): 객체화 시키는 방법
		
		Car car1 = new Car();
//		System.out.println(car1.color);
		car1.autopilot();
		
	}
			
}
class Car{
	//전역변수
	String color = "red";
	
	public void drive() {
		int speed = 80; //지역변수
		System.out.println(speed + "속도로 달려요!");
		
	}
	
	public void autopilot() {
//		System.out.println(speed+"속도로 "); // 다른 메소드 안에서는 접근 불가.
//		drive();
		System.out.println(color + " 색 차가");
		System.out.println("자율주행 해요!");
	}
}
