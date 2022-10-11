package day06.innerclass;

import day06.innerclass.mypac.Weapon;

/*
 * [[ 익명클래스(Anonymous Class) ]]
 * 
 * 	클래스 선언과 객체 생성을 동시에 하는 이름 없는 클래스
 * 	주로 버튼 이벤트핸들러(리스너, 감시함.)나, 안드로이드 이벤트에 사용된다.
 * 	일회용 클래스이다. 
 * 
 */

public class MainClass03 {
	public static void main(String[] args) {
		 
		Weapon w = new Weapon() { //인터페이스를 상속받아 클래스화했는데 이름이 없으므로 익명 클래스
			
			@Override
			public void attack() {
				System.out.println("공격!");
				
				
			}
		};
		
		w.attack();
	}

}
