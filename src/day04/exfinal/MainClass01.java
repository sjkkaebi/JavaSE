package day04.exfinal;
/*
 * 
 * final -상수
 * 	처음 할당된 값이 변경되지 않는다. //변수명 대부분 대문자로 씀.
 */

public class MainClass01 {
	public static void main(String[] args) {
		final double PI = 3.14159; //원주율
		
		//원의 반지름
		int r = 10;
		//원의 넓이
		double area = PI * r * r;
		System.out.println("원의 넓이:" + area);
		
		area = Math.PI * Math.pow(r,  2);
		System.out.println("원의 넓이:" + area);
		
		
	}

}
