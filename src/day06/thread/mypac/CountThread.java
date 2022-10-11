package day06.thread.mypac;

public class CountThread extends Thread {
	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			
		}//for끝
		System.out.println("CountThread 종료!");
	}

}
