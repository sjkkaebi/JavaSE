package day02.basic;

/*
 * 삼항 연산자
 * 
 * 조건식 ? 조건식이 참인 경우 : 조건식이 거짓인 경우
 */
public class MainClass06 {
	public static void main(String[] args) { //간단한 조건이 필요할 때 if 말고 이거 많이 씀. 한줄로 정렬하여 보기 간단하기 때문.
		
		int num = 10;
		String result = num > 0 ? "num은 양수" : "num은 음수";
		System.out.println(result+ "입니다.");
			
		String result2 = null; //변수 선언만 함. 공백도 아니고 어떤 값도 없는 것. 정해지지 않은 것? , else가 나오기 때문에 null값을 줌.
		if(num>0) {
			result2 = "num은 양수";
		} else {
			result2 = "num은 음수"; //거짓일 때 출력되지 않는 게 아니라 지정한 값이 나왔으면 좋겠어!
		}
		
		System.out.println(result2+ "입니다.");
		
		
		// 혼자 연습 1
		String result3 = "num은 양수";
		if(num>0) {
			System.out.println(result3);
		}
		
		// 혼자 연습 2
		
		String result4 = null;
		if(num>0) {
			System.out.println("num은 양수");
		}
		else {
			System.out.println("num은 음수");
		}
		System.out.println(result4 + "입니다.");
		
		// 혼자 연습 3
		
		String result5 = null;
		if(num>0) {
			result5 = "양수";
		}
		else {
			result5 = "음수";
		}
		System.out.println(result5 + "입니다.");
		
		}
	}
