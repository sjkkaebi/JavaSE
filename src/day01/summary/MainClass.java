package day01.summary;

/*
 
 객체란 
 	물리적으로 존재하거나 추상적으로 생각할 수 있는 것 중에서 
 	자신과 다른 것을 식별가능한 것
 	예) 실제 존재하는 -학생, 회원, 자동차, 휴대폰
 	 	추상적인 것 - 생산, 주문, 배송 등
 	 모두 객체가 될 수 있다.
 	 
 	 최소한의 프로그램 단위
 	 
 	 객체를 만들기 위해 주형(붕어빵틀) 또는 설계도 같은 Class가 필요하다.
 	 
 	 
 Class 구조
 
 class 클래스명 {
 	생성자()
 	변수
 	메소드
 }
 
 
 객체 구성 요소
 	속성 => 변수: 값을 담고 있는 그릇
 	기능 => 메소드(함수)
 	
 Ctrl + F11 콘솔 실행
 
 java에서는 메인 메소드만 실행됨
 
 */


//객체생성에 대하여


public class MainClass {
		public static void main(String[] args) {
			System.out.println("메인메소드 입니다.");
			
			Car car1 = new Car();
			System.out.println("모델 : " + car1.model);
			System.out.println("color : " + car1.color);
			
			car1.drive();
			car1.autopilot();
	
		
		}

}

class Car {
		String model = "테슬라Y";
		String color = "red";
		//속성값(상태정보 변수로 담김)
		
		
		//드라이브 함수(기능, 스킬을 쓰거나 행위를 함)
		public void drive() {
			System.out.println("드라이브를 합니다.");
		}
		
		//자율주행 함수
		public void autopilot() {
			System.out.println("자율주행을 합니다.");
		}
}























