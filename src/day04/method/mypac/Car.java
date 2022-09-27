package day04.method.mypac;

public class Car {
	// 엔진이 시동이 걸렸는지 저장하는 멤버필드(자동차 객체 하나 생성)멤버필드 =변수
	private boolean isEngineStrated = false;  //낙타표기법
	//팟홀표기법 is_engine_trated 
	
	// 멤버 메소드
	public void drive() {
		if (isEngineStrated) {
			System.out.println("차가 움직여요!");
			
		}else {
			System.out.println("엔진이 꺼져 있어서 움직일 수 없어요!");
			
		}
	}
		// 엔진을 정지시키는 메소드
		public void stopEngine() {
			isEngineStrated = false;
			System.out.println("엔진이 꺼졌습니다.");
		}
		// 엔진을 다시 켜는 메소드
		public void startEngine() {
			isEngineStrated = true;
			System.out.println("엔진이 켜졌습니다.");
		}
		
		public boolean getisEngineStrated() {
			return isEngineStrated;
		}
		
		public int sum(int a, int b) {
			return a + b;
			
//			public int sum2(int a, int b) {
//				int resultNum= a + b;
//				return resultNum;
			}
		}
//	}


