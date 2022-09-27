package day04.constructor;

import day04.constructor.mypac.HandPhone;

/*
 * [[ 생성자(constructor) ]]
 * 객체를 생성할 때 호출하는 반환값이 없는 메소드. 정확히는 메소드는 아니다.
 * 객체 초기화 목적에 사용
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		HandPhone hp = new HandPhone();
		
		HandPhone hp2 = new HandPhone("아이폰");
		
		System.out.println("hp model: " +hp.model);
		System.out.println("hp2 model: " +hp2.model);
	}

}
