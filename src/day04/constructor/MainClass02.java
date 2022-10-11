package day04.constructor;

import day04.constructor.mypac.Member;

/*
 * 
 * Ctrl + Shift + F 이
 */

public class MainClass02 {
	public static void main(String[] args) {
		Member mb = new Member();
		System.out.println(mb.getNum());
		
		Member mb2 = new Member(1, "피카츄", "신촌");
		System.out.println(mb2.getName());
		
	}

}
