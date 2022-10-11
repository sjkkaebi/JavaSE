package day07.collections;

import java.util.Stack;

/*
 * [[ Stack Class ]]
 * 
 *  - 스텍의 구조: 선입후출 형태
 *  
 *  /배열 객체는 아니고 배열성 변수를 가지는 것이 콜렉션
 *    
 */

public class MainClass01 {
	public static void main(String[] args) {
		//Stack 객체 생성하기
		
		Stack<String> stack = new Stack<String>();
		
//		stack = null; 에러(java.lang.NullPointerException)
		
		//생성한 객체에 자료 저장하기
		stack.push("피카츄");
		stack.push("라이츄");
		stack.push("파이리");
		
		// 현재 저장하고 있는 데이터 개수를 출력
		System.out.println("데이터의 개수: " + stack.size());
		
		// 데이터 하나씩 빼오기
//		System.out.println("1: " + stack.pop());
//		System.out.println("2: " + stack.pop());
//		System.out.println("3: " + stack.pop());
		
		
		// 가장 위에 있는 데이터를 출력하려면
		System.out.println("가장 위에 있는 데이터: " + stack.peek());
		
		while(!stack.empty()) {	// 이미 다 출력해버리면 데이터가 비기 때문에 그거 확인하는 함수
			String name = stack.pop();
			System.out.println("pop 한 데이터: " + name);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
