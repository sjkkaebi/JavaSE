package day02.basic;

/*
 * 증감 연산자
 * 
 * ++ : 1씩 증가 시킨다.
 * -- : 1씩 감소 시킨다. 
 * 
 */

public class MainClass02 {
	public static void main(String[] args) {
		int num = 0;
		num = num+1;
		System.out.println("1 증가 시킨 후:" + num);
		num++; //위에랑 같은 것
		System.out.println("1 증가 시킨 후:" + num);
		
		//0~99 까지 출력하는 for문(반복문, false가 될 때까지 true일 때 계속 실행됨)
		for(int i=0; i < 100; i++) { //i가 100이 될 때까지 증감을 해줌 //(정수 지정; 조건 설정 트루인지 폴스인지 판단; i=i+1 마지막에 작동)
			System.out.println(i+"");
		}
		
		System.out.println();
		
		//변수의 값을 1씩 감소 시키기
		int num2 = 0;
		num2 = num2 - 1;
		System.out.println("1감소 시킨후:" + num2);
		num2--;
		System.out.println("1감소 시킨후:" + num2);
		
		for(int i=99; i >= 0; i--) { 
			System.out.println(i+"");
		
		}
		
		// num3: 1
		// num3: 1
		
		int num3 = 0;
		System.out.println("num3:" + ++num3);
		
		num3=0;
		System.out.println("num3" + num3++);
		
		num3 =0;
		System.out.println("num3" + num3); //먼저 실행되는 값
	}
	

}
