package day02.basic;

/*
 * 비교 연산자
 * 
 * > : 크다
 * >= : 크거나 같다
 * < : 작다
 * <= : 작거나 같다
 * == : 같다
 * != : 다르다
 */

public class MainClass03 {
	public static void main(String[] args) {
		boolean result = 10 > 20; // boolean이라는 데이어 타입을 줬으므로 true나 false로 판단할 수 있는 조건식으로 변수(result)를 지정하거나 true, false가 세트로 옴? 
		
		result=true; // 10은 20보다 작으므로 원래 if문에서 출력이 안됨. 그런데 변수인 result 값을 true로 줘버리면 true가 되어 출력됨.
		if(result)
			System.out.println("10은 20보다 크다"); // if 문에서 출력값이 한 줄일 땐 {} 중괄호 안해도 됨.
		
		result = 10 <= 20;		
		if(result) {
			System.out.println("10은 20보다 작거나 같아요");
			} // if 안 괄호에는 조건문이 들어감.
		
		result = 10 == 10;
		if(result)
			System.out.println("10과 10은 같아요");
		
		result = 10 != 20;
		if(result)
			System.out.println("10은 20과 달라요");
		
		
		
		if(20<30) {System.out.println("메롱"); //boolean을 지정하는 이유는?

			}
		
		}
		

	}

