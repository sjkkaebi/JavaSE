package day05.interfaceEx;

import day05.interfaceEx.mypac.AKWeapon;
import day05.interfaceEx.mypac.Weapon;

/*
 * [[인터페이스 (interface)]]
 * 	
 * 	추상메소드만 있다.
 * 	상수선언까지 허용.
 * 
 * 	뼈대를 만들어준다
 * 
 * 	사용방법 - class가 아닌 interface 예약어로 선언한다. 
 * 
 */

public class MainClass01 {
	public static void main(String[] args) {
		AKWeapon ak = new AKWeapon();
		
		ak.attack();
		ak.attackSky();
	
		System.out.println(ak.NAME);
		ak.autoAttack();
		
		// 다형성
		Weapon ak2 = new AKWeapon();
		ak2.attack();
//		ak2.autoAttack
		
		AKWeapon ak3 = (AKWeapon)ak2;
		ak3.autoAttack();
		
	}

}
