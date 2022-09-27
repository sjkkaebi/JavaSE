package day03.array;

/*
 * 
 * for 반복문 연습
 * 
 * [ 숙제!! ]
 * 
 1번
       
   	 *
    **
   ***
  **** 
 ***** 
****** 

2번
   *
  ***
 *****
*******

3번

   *
  ***
 *****
*******
 ***** 
  ***
   *
  
*/

public class MainClass0 {
	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			
			for(int j = 0; j <= i; j++) { // =이 들어가야 공백이 안생김
				System.out.print("*"); 
			}
			System.out.println();
		}
		
		
	}

}
