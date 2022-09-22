package day02.basic;

/*
 * do ~ while() 문
 * 
 * do{
 *  ..반복 수행할 문장 
 * }while(조건문);
 * 
 */

public class MainClass13 {
	public static void main(String[] args) {
		int count = 0;
		do { //최소 한 번은 실행된다.
			System.out.print(count+ " ");
			count++;
		}while(count<100);
	} //do 안에 한번은 실행이 됨. 그 다음에 조건이 걸리기 때문. (count<0)인 경우에도 0이 뜸.


}
