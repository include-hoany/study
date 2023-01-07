package ch10;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class TestCalendarTwo {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Calendar calTwo = Calendar.getInstance();
		
		//년월일 설정
		cal.set(2020, 10, 10);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		
		//시간은 한번에 설정 불가
		cal.set(Calendar.HOUR_OF_DAY, 15);
		cal.set(Calendar.MINUTE, 50);
		cal.set(Calendar.SECOND, 15);
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy-MM-dd");
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		
		System.out.println("두번째");
		System.out.println(calTwo.get(Calendar.YEAR));
			
		long time = calTwo.getTimeInMillis() - cal.getTimeInMillis();
		System.out.println((((time / 1000) / 60) / 60)/24 + "일차");
	
//		cal.clear(); // 1970 1월 1일 00:00:00 Epoch Time
		//현재시간을 사용할것이 아니라면 초기화 하고 사용하는게 좋다.
		
		cal.clear(Calendar.YEAR);
		sdf.applyPattern("yyyy-MM-dd");
		System.out.println(sdf.format(cal.getTime()));
	}

}
