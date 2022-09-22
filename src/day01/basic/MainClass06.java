package day01.basic;


/*
 * [[ 참조형데이터형(레퍼런스형) ]] / 기본형은 자바에서 제공해주는 기본 타입. 이건 자바에서 해주는 게 아니라 객체로 만들어진 변수형. 클래스로 만들어져서 제공.
 * 
 * String 형 
 * 	- 선언하는 방법
 * 		String 변수명; 타입 + 변수명
 * 	- 문자열을 저장할 수 있다. 
 * 
 * 
 * 자바에서 제공해주는 기본형 변수 타입 8개 - boolean, char, byte, short, int, long, float, double
 * (명령어라 변수명으로 사용불가. 이클립스에서 빨간색, 소문자로 시작 표시)
 * 
 *  참조형 - 기본형을 제외한 모든 클래스(직접 만들어서 사용도 가능. ctrl 누르면 만들어진 class가 뜸)
 *  
 *  h	e 	l 	l 	o
 *  0	1	2	3	4	=> 인덱스 번호
 	: string은 캐릭터char의 집합. char마다 방이 있음. 공백(space)도 문자로 인식(로그인할 때 실패한 경우 스페이스도 문자로 인식해서 그렇다.)
 */

public class MainClass06 {

	public static void main(String[] args) {
		// 변수 선언과 동시에 값 대입하기
		String str = "서울 특별시 서대문구 신촌";
		boolean isContain = str.contains("특별시"); //contain이 함수. 포함됐으면 true로 반환?을 해줌. crtl 누르면 class 뜸 // True
		if(isContain) { //조건문. 분기를 해줌. true면 중괄호 안에가 실행이 됨. false면 실행 불가. if(논리형변수, 논리형 비교연산자) // True여서 실행이 됨. 불린과 이프는 같이 사용
			System.out.println("str 에는 특별시 라는 문자열이 있어요!");
		}
		System.out.println("4번째 인덱스:" + str.charAt(3)); //chartAT이라는 함수. 음수는 오류.. 다른 파이썬 등에서는 음수값 넣으면 끝으로 감.
		
		//변수에 저장된 내용을 문자열로 출력해보기
		System.out.println(str);
	}
}
