package day06.thread.mypac;

public class Brother extends Thread {
	public Wallet wallet; //지갑 객체
	public int money; //인출한 돈을 저장할 변수
	
	//생성자에서 지갑의 참조값을 받아와서 필드에 저장한다.
	
	public Brother(Wallet wallet) {
		this.wallet = wallet;
	}
	@Override
	public void run() {
		while(true) {
			//지갑에서 돈을 인출해서 저장한다.
			int returnedMoney = wallet.getMoney();
			if(returnedMoney == 0) break;
			money = money + returnedMoney;
		} //while 문 끝
		
		System.out.println("Brother 총 재산: " + money);
	}

}
