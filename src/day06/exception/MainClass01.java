package day06.exception;
/*
 * [[ 익셉션(Exception) : 예외 ]]
 * 	- 프로그램 실행 도중 발생되는 에러에 해당된다. (자바 문법상 컴파일 에러와는 다름. 사용자가 사용할 때 catch를 통해 에러메시지 띄울 수 있음)
 *  - 예외 처리: 예외가 발생되었을 때 이를 처리하는 것
 *  
 *  처리하는 방법:
 *  
 *  try {
 *  	실행문장;
 *  }catch(익셉션클래스명 변수명) {
 *  	해당 예외가 발생했을 경우 실행할 문장;
 *  }
 * 
 * 
 */

public class MainClass01 {
	public static void main(String[] args) {
		// 정수값을 저장할 지역변수 초기화 하기, 전역변수는 초기화 안하면 초기값 뜸(?) 지역변수는 에러남.
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		
//		result = num1/num2;
		
//		if(num2 != 0) {
//			result = num1/num2;
//			System.out.println("실행결과 : " + result);
//		} else {
//			System.out.println("어떠한 수를 0으로 나눌 수 없습니다.");
			
		try {
			result = num1 / num2;
			System.out.println("실행결과 : " + result);
			
			
		} catch (Exception e) {
			System.out.println("어떠한 수를 0으로 나눌 수 없습니다.");
		//	e.printStackTrace();
			System.out.println("무슨 에러야?" + e.getMessage());
		}
			
		}
	}



















