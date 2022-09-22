package day02.basic;

/*
 *  반복문 while
 *  
 *  while (조건문) {
 *   ...반복 수행할 문장.
 * }
 * 
 * //true이면 계속 돔. false일 때까지. true를 적어놓은 건 프로그램 끌때까지 계속 돌아라.
 * 
 */

public class MainClass12 {
	public static void main(String[] args) {
		//while 문을 이용해서 0~99까지 출력해보기
		int count=0; // 카운트를 세기 위한 변수
		while(true) {
			System.out.println(count+"");
			count++; //카운트로 증가
			if(count==100)
				break; //반복문을 벗어나라.
		}
			System.out.println("while문 끝!!");
			
			/*
			 * 다른 형태로 사용하기
			 */
			count=0; //카운트 초기화
			boolean isRun=true; //-이다. is로 많이 시작
			while(isRun) {
				System.out.print(count+ " ");
				count++; 
				if(count==100)isRun=false;
			}
			System.out.println(); //개행하기
			
			count=0; //카운트 초기화
			while(count<100) {
				System.out.print(count+ " ");
				count++;
			}
					
			

		}
	}


