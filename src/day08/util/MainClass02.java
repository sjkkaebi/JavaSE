package day08.util;

import java.util.Calendar;

/*
 *  [[ Calendar Class ]]
 * 
 * 
 */

public class MainClass02 {
	public static void main(String[] args) {
		
		// Calendar 객체 참조값 얻어오기
		Calendar calNow = Calendar.getInstance(); // 생성자가 protected로 되어 있어서 메소드로 호출해줘야 함
		
		int year = calNow.get(Calendar.YEAR); //년
		
		System.out.println("올해: " + year);
		
		
		int month = calNow.get(Calendar.MONTH) + 1; // 0월부터라 +1 해줘야 한다.
		
		System.out.println("월: " + month);
		
		int day = calNow.get(Calendar.DAY_OF_MONTH); // 일
		
		System.out.println("일: " + day);
		
		int hour = calNow.get(Calendar.HOUR);
		int min = calNow.get(Calendar.MINUTE);
		int sec = calNow.get(Calendar.SECOND);	
		
		System.out.println(hour + " : " + min + " : " + sec);
		
	}

}
