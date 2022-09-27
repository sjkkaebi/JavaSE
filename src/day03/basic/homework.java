package day03.z;

public class homework {
	public static void main(String[] args) {
				
		for (int i = 1; i < 7; i++) {
			
			for(int j = 1; j <= i; j++)	
				{System.out.print("*");
					}
			
			System.out.println();
			
			if(i==1) {
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
		
		
		//for(int i = 5; i >= 0; i--) {
	
//	for(int j=5; j >= i; j--) {
//		System.out.print(" *");
//		}
//	System.out.println(); // 앞에 것이 누적되어 쌓이는 개념

}
}
		
	


//if else if else