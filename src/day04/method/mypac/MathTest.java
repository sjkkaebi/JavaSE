package day04.method.mypac;

public class MathTest {
	public double getArea(int r) { //넓이값을 얻어오겠다.:get
		final double PI = 3.14159;
		
		double area = PI * r * r;
		
		return area;
		}
		//매개변수 3개짜리 Sum 메소드
		public int sum(int a, int b, int c) { //매개변수
			return a + b + c;
	}
		//매개변수 2개짜리 Sum 메소드
		public int sum(int a, int b) { //매개변수
			return a + b;
		}
		
		//매개변수 2개짜리 문자열 Sum 메소드
		public int sum(String a, String b) {
			int resultNum = Integer.parseInt(a) + Integer.parseInt(a);
			
			return resultNum;//매개변수
		}
			
		
		public int total(int[] nums) {
			
			int result = 0;
			for(int i=0;i < nums.length; i++) {
				result += nums[i];
				
			}
			return result;
		}

}
