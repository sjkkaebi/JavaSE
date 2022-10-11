package day06.exception;

/*
 * throws 된 Exception 처리
 * 
 */
public class MainClass05 {
	public static void main(String[] args) {
		NumberPrinter p = new NumberPrinter();
		
		try {
			p.printNumber();
		} catch (InterruptedException e) {
			System.out.println("익셉션 발생");
		}
	}

}
