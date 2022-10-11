package day05.abstractEx.mypac;

/*
 * 상속 받는 방법
 * 	class 클래스명 extends 상속 받을 클래스명
 * 
 */

public class Woman extends Human {

	@Override //추상메소드 재구현
	
	// 오버라이딩 - 부모 메소드 재정의 
	
	public void dance() {
		System.out.println("춤을 춰요!");
		
	}
	

}
