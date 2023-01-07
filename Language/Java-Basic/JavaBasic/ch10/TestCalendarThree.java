package ch10;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestCalendarThree {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy-MM-dd");
		
		date.clear();
		date.set(2020, 7, 31);
		
		date.add(Calendar.DATE, 1);
		date.add(Calendar.MONTH, 1);
		
		// add는 말일에 + 1 경우 월필드에 영향을 미침
		
		System.out.println(sdf.format(date.getTime()));
		
		// 다만 roll 은 말일에 add가 일어난다고 해도 년월일 필드에 영향을 안미침
		
		date.clear();
		date.set(2020, 7, 31);
		date.roll(Calendar.DATE, 1);
		
		System.out.println(sdf.format(date.getTime()));
		
		
		// Calendar 를 Date 로 변환 
		Calendar cal = Calendar.getInstance();
		Date d = new Date(cal.getTimeInMillis());
		
		// Date를 Calendar로 변환
		Date dTwo = new Date();
		Calendar calTwo = Calendar.getInstance();
		calTwo.setTime(dTwo);
		
	}

}
