package day05.interfaceEx.mypac;

public class HandPhone implements Phone{

	@Override
	public void call() {
		System.out.println("전화를 걸어요");
		
	}

	@Override
	public void receive() {
		System.out.println("전화를 받아요");
		
	}
	
	public void sendMsg() {
		System.out.println("문자를 보내요");
	}

}
