package day05.abstractEx;

import day05.abstractEx.mypac.Woman;

/*
 * [[ 추상클래스,(Abstract Class) ]]
 *	
 *	구현되지 않은 추상 메소드가 존재 한다.
 *	정의만 하고 구현 X.
 *	미완성 클래스
 *	미완성 메소드 가지고 있다.
 *	상속 받고 반드시 오버라이딩! 해야 한다.
 *
 *	만드는 방법: class 예약어 앞에 abstract를 붙여준다.
 */

public class MainClass01 {
	
	public static void main(String[] args) {
		
		Woman w = new Woman();
		w.dance();
		w.say();
		
	}

}
