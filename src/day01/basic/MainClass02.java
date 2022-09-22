package day01.basic;

/*
 * [[ 기본 자료형 ]]
 * 2. 문자형(char)
 * 	- 선언하는 방법
 * 		char 변수명; 한 글자만 담을 수 있음. 
 * 가질 수 있는 범위: 0~65535
 * 따라서 총 65536 가지의 글자를 표현할 수 있다.
 * 전 세계에서 쓰이는 문자 형태를 대부분 다 표현 가능.
 * 
 * 
 */

public class MainClass02 {
	
	public static void main(String[] args) {
		// char 형 변수 선언과 동시에 값 대입하기
		char ch1 = 'A';
		//출력해보기
		System.out.println("char 형 변수에 저장된 문자:" + ch1);
		char ch2 = '李';
		char ch3 = '쀍';
		
		System.out.println("char 형 변수에 변경된 문자:" + ch2);
		
		int num = ch1; //char 형을 int 형으로 형변환, int는 정수
		System.out.println("대문자 A에 해당하는 숫자코드 :" + num);
		
		//같은 건데 캐릭터는 문자형으로 인트는 값으로 표현하는 것, A=65로 인식
		
		int num2 = 110;
		char ch4 = (char)num2; // int 형을 char 형으로 강제 형변환
		System.out.println(ch4);
		
	}

}
