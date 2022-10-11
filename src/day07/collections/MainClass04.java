package day07.collections;

import java.util.HashSet;
import java.util.Iterator;

/*
 * [[ HashSet Class]]
 *  - 데이터 순서가 없다.
 *  - 중복값이 들어가지 않는다.
 * 
 * 
 * 
 */
public class MainClass04 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		
		//데이터 저장
		hs.add("피카츄");
		hs.add("라이츄");
		hs.add("파이리");
		hs.add("꼬부기");
		hs.add("꼬부기"); 
		
		//사이즈 확인
		System.out.println(hs.size());
		
		//반복자
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {  // 그 다음이 있냐 없냐. 값이 있으면 true로 돌려줌. 값이 없으면 false로 돌려서 끝내줌.
								// 자료가 있다면 반복문을 돈다.
			
			// 값 읽어오기
			String value = it.next(); // 값이 있으면 값을 돌려줌
			//출력해보기
			System.out.println(value);
			
			
		}
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
