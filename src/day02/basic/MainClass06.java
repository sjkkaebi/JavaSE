package day02.basic;

/*
 * 삼항 연산자
 * 
 * 조건식 ? 조건식이 참인 경우 : 조건식이 거짓인 경우
 */
public class MainClass06 {
	public static void main(String[] args) { //간단한 조건이 필요할 때 한줄로 많이 씀, if 말고 이거 많이 씀
		int num = 10;
		String result = num > 0 ? "num은 양수" : "num은 음수";
		System.out.println(result+ "입니다.");
		
		String result2 = null; //변수 선언만 함. 공백도 아니고 어떤 값도 없는 것
		if(num>0) {
			result2 = "num은 양수";
		} else {
			result2 = "num은 음수";
		}
		
		System.out.println(result2+ "입니다.");
		}
	}
