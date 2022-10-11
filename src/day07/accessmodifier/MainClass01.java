package day07.accessmodifier;

import day07.accessmodifier.mypac.Phone;

/*
 * [[ 접근제어자 ]]
 * 
 * public - 모든 클래스에서 접근 가능
 * protected - 같은 패키지 또는 상속 관계에서 접근 가능
 * default(아무것도 안 쓴 것) - 같은 패키지 접근 가능
 * private - 같은 클래스 안에서만 접근 가능 
 * 
 */
public class MainClass01 extends Phone {
	public static void main(String[] args) {
		int num = 10;
		

		Phone p1 = new Phone();
		
		p1.setName("일반 무선전화기");
		
		String name = p1.getName();
		System.out.println(name);
		
	}
	


		
		
		
		
		
	}


