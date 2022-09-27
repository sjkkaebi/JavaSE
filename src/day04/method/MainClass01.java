package day04.method;

import day04.method.mypac.Car;

/*
 * [[ 메소드(method) ]]
 * 		어떤 특정 작업을 수행하기 위한 명령문의 집합. 
 * 
 * 접근제어 (정적) 변환타입 메소드 이름(매개변수) { //선언부
 * 		명령문 // 구현부
 * 		
 * 		return 반환값
 * }
 * 
 */

public class MainClass01 {
	public static void main(String[] args) {
		//Car 객체 생성하기
		Car car1 = new Car();
		Car car2 = new Car();
		
		
		car1.drive();
		car1.startEngine();
		
		car1.drive();
		System.out.println("car2 입니다.");
		
		car2.drive();
		car2.startEngine();
		car2.drive();
		
		//독립적. 서로 영향을 안 받는 객체, 그러나 static이면 공통값이니까 영향을 받겠지
		
		boolean result = car2.getisEngineStrated();
		System.out.println("reuslt:" + result);
		
		int resultnum = car2.sum(10, 5);
		System.out.println("resultnum: " + resultnum );
	}
}
