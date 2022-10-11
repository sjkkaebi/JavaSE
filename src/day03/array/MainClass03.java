package day03.array;

//배열 출력 연습

public class MainClass03 {
	public static void main(String[] args) {
//		String[] names = new String[5];
		//각각의 방에 이름을 저장하기
//		names[0] = "피카츄";
//		names[1] = "라이츄";
//		names[2] = "나옹";
//		names[3] = "울먹이";
//		names[4] = "질퍽이";
		
		String[] names = {"피카츄", "라이츄", "나옹", "울먹이", "질퍽이"};
		
		//배열의 내용 출력해보기
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[1]);
		}
		//확장 for 문
		for(String tmp : names)
			System.out.println(tmp);
		
		int []scores = {0,1,2,3};
		for(int tmp : scores) {
			System.out.println(tmp);
		}
		
		int[][] scores2 = new int[2][];
		scores2[0] = new int[2];
		scores2[1] = new int[3]; 
		System.out.println(scores2[0][2]); //컴파일 에러. 
	}
	
	

}
