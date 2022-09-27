package day04.method;

import day04.method.mypac.MathTest;

public class MainClass02 {
	public static void main(String[] args) {
		
	//MathTest crtl+space 해서 import 불러오기로 저장된 함수값을 불러와야됨.
		//객체 생성
	MathTest mt = new MathTest();
	
	//원의 넓이 값 변수 선언
	double result = mt.getArea(10);
	
	System.out.println("result:" + result);

	}
}
