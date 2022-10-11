package day07.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 *  [[ HashMap Class ]]
 *  
 *   - Map 인터페이스를 구현한 클래스이다.
 *   - Key 값, value 값을 쌍으로 저장한다. (사전 형태) 
 *   - Key 값은 중복 안됨.(뒤에 있는 애로 수정됨) value 는 됨.
 * 
 */

public class MainClass05 {
	
	public static void main(String[] args) {
		//HashMap 객체 생성해서 변수에 담기
		HashMap<String, String> map1 = new HashMap<>();
		
		//데이터 저장하기
		map1.put("hello", "안녕하세요");
		map1.put("car", "자동차");
		map1.put("tiger", "호랑이");
		
		//데이터 빼오기
		String value = map1.get("hello"); //인덱스번호가 아니라 K값으로 가져오면 됨
		
		System.out.println("hello: " + value);
		
		// 맵에 있는 키값을 저장하고 있는 Set 객체를 얻어온다.
		Set<String> set = map1.keySet();	//set 타입으로 리턴해줌
		
		// Set -> 반복자 객체
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {	//자료(key값)가 있다면 반복문이 돈다.
			String keyValue = it.next();	//key 값 읽어온다.
			
			//해당 key값에 할당되어 있는 value 값을 읽어온다.
			String value2 = map1.get(keyValue);
			
			//value 값 출력해보기
			System.out.println(value2);
					
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
