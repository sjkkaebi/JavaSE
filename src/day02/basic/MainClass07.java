package day02.basic;

/*
 *  여러가지 형태의 if 문 사용해보기
 * 
 */
public class MainClass07 {
	public static void main(String[] args) {
		int num = 11;
		if(num%2 == 0) {
			System.out.println("num은 짝수 입니다.");
			System.out.println("두번째 라인입니다.");
		}
		if(num%2!=0) {
			System.out.println("num은 홀수입니다.");
			System.out.println("두번째 라인입니다.");
			
		}
		
		if(num%2 == 0) {
			System.out.println("짝수 입니다.");
		}else {
			System.out.println("홀수 입니다.");
		} // 조건이 안맞으면 else가 실행
		
		
		if(num%2 == 1)
			System.out.println("홀수 입니다.");
		else
			System.out.println("짝수 입니다."); //실행하는 코드가 한 줄 일때는 중괄호 생략 가능
		
		
	}

}
