package day03.array;

/*
 * 1. 문자열을 5개 담을 수 있는 배열 객체를 생성하고 5명의 이름을 저장해보세요.
 * 2. 저장된 배열의 내용을 모두 출력해보세요.
 * 3. 저장된 배열의 내용을 수정하고 출력해 보세요.
 * 
 */
public class MainClass02 {
	public static void main(String[] args) {
		//배열객체 생성하기
		String[] names = new String[6];
		//각각의 방에 이름을 저장하기
		names[0] = "피카츄";
		names[1] = "라이츄";
		names[2] = "파이리";
		names[3] = "꼬북이";
		names[4] = "버터풀";
		names[5] = "야도란";

		//피카츄		System.out.println(names[0]); 
		//6			System.out.println(names.length);
		
		for (int i = 0; i < names.length; i++) { 	
			System.out.println(names[i]);
		}
		
		//확장 for 문을 이용해서 출력하기. 배열성 객체가 들어왔을 때 (names) 사용 가능.
		for (String tmp : names) {
			System.out.println(tmp);
		}
		
		names[4] = "잠만보";
		for (String tmp : names) {
			System.out.println(tmp);
		}
	}

}
