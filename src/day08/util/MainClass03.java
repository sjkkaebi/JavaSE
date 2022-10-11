package day08.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class MainClass03 {
	public static void main(String[] args) throws ParseException {
		getDate();
		getDateAndDay();
		getDateTimeAndDay();
		
		String dDay = dateCalc("2022-10-11 10:11:00", "yyyy-MM-dd HH:mm:ss", -2, 0, 0, 0, 0, 10);
		
		System.out.println("날짜 계산 2년 전과 10초 후: " + dDay);
		
	}
	

	

	public static void getDate() {
		
		// 날짜 객체
		Date date = new Date();
		
		// 날짜 포맷 변경해주는 객체
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String strDate = sdf.format(date);
		
		System.out.println(strDate);
	}

public static void getDateAndDay() {
		
		// 날짜 객체
		Date date = new Date();
		
		// 날짜 포맷 변경해주는 객체
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		// 요일값 반환 0~6(일~토)
		int sday = date.getDay();
		
		String strDay = ""; //null은 객체가 생성이 안된거고(변수선언만 되고 메모리의 힙영역에 아직 안올라간 것), 얘는 객체가 생성이 된 것(값은 없지만)
		//null로 해도 됨. 사실 메모리를 잡아먹기 때문에 비효율코드인 것 맞지만 이정도는 ㄱㅊ다.
		
		if(sday == 0) {
			strDay = "일";	
		}else if (sday == 1) {
			strDay = "월";
		}else if (sday == 2) {
			strDay = "화";
		}else if (sday == 3) {
			strDay = "수";
		}else if (sday == 4) {
			strDay = "목";
		}else if (sday == 5) {
			strDay = "금";
		}else if (sday == 6) {
			strDay = "토";
		}
		
		String strDate = sdf.format(date);
		String result = strDate + "(" + strDay + ")";
		
		System.out.println(result);
}
		
		
		
		public static void getDateTimeAndDay() {
			
			// 날짜 객체
			Date date = new Date();
			
			// 날짜 포맷 변경해주는 객체
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
			
			
			int sday = date.getDay();
			
			String strDay = ""; //null은 객체가 생성이 안된거고(변수선언만 되고 메모리의 힙영역에 아직 안올라간 것), 얘는 객체가 생성이 된 것(값은 없지만)
			//null로 해도 됨. 사실 메모리를 잡아먹기 때문에 비효율코드인 것 맞지만 이정도는 ㄱㅊ다.
			
			if(sday == 0) {
				strDay = "일";	
			}else if (sday == 1) {
				strDay = "월";
			}else if (sday == 2) {
				strDay = "화";
			}else if (sday == 3) {
				strDay = "수";
			}else if (sday == 4) {
				strDay = "목";
			}else if (sday == 5) {
				strDay = "금";
			}else if (sday == 6) {
				strDay = "토";
			}
			
			String strDate = sdf.format(date);
			String result = strDate + "(" + strDay + ")";
			
			System.out.println(result);
			
		}
	
		//날짜 계산
		public static String dateCalc(
				String strDate,
				String format,
				int addYear,
				int addMonth,
				int addDate,
				int addHour,
				int addMinute,
				int addSecond		
				) throws ParseException {
			
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			Date date = sdf.parse(strDate);
			Calendar cal = Calendar.getInstance();
			
			cal.setTime(date);
			
			cal.add(Calendar.YEAR, +addYear);
			cal.add(Calendar.MONTH, +addMonth);
			cal.add(Calendar.DATE, +addDate);
			cal.add(Calendar.HOUR_OF_DAY, +addHour);
			cal.add(Calendar.MINUTE, +addMinute);
			cal.add(Calendar.SECOND, +addSecond);
			
			SimpleDateFormat sdf2 = new SimpleDateFormat(format);
			String toDate = sdf2.format(cal.getTime());
			
			return toDate;
			
		
		
		
			
		
					
		}
		
		
		
		
		
		
}
