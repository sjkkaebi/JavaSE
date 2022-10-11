package day06.thread;

public class MainClass06 {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("익명스레드 가 시작되었습니다.");
				
				try {
					Thread.sleep(2000); //2초 쉰다.
				} catch (Exception e) {}
				
				System.out.println("익명스레드 가 종료됩니다.");
				
			}
		}).start();
		
		System.out.println("메인 스레드가 종료됩니다.");
	}

}
