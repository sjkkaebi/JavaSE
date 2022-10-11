package day03.HW;

public class homework02 {
	public static void main(String[] args) {
			
		for (int i= 0; i < 3; i++) {
			
			for(int j = 0; j <= i; j++) { // =이 들어가야 공백이 안생김
				System.out.print("**"); //쌓이는 개념
					}
			
			System.out.println();
				
			if(i==0) {
				System.out.print("     ");
			}
			else if(i==1) {
				System.out.print("    ");
			}
			else if(i==2) {
				System.out.print("   ");
			}
			else if(i==3) {
				System.out.print("  ");
			}
			else if(i==4) {
				System.out.print(" ");
			}
			else {
				System.out.print("");
			
				
			}
				}
		
	}

}
