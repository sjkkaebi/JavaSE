package day06.thread.mypac;

public class Wallet {
	public int totalMoney = 10000;
	
	// 병렬 비동기 프로그램에서
	// synchronized 동기화 시켜주는 예약어(줄을 세워서 순서대로 실행되게 함)
	public synchronized int getMoney() {
		
		if(totalMoney == 0) return 0;
		totalMoney = totalMoney -1;
		System.out.println("현재 지갑의 금액:" + totalMoney);
		
		return 1;
	}

}
