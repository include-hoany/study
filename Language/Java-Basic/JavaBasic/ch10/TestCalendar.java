package ch10;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class TestCalendar {
	public static void main(String[] args) {
		// Calendar 추상클래스 이므로 객체는 인스터스로 받아야함
		// 그레고리역을 기준으로 반환해줌
		Calendar cal = Calendar.getInstance();
		
		int thisYear = cal.get(Calendar.YEAR); // 올해년도
		// 매개변수 확인
		// Calendar.MONTH 0부터 시작하는 월
		// Calendar.WEEK_OF_YEAR 해당연도의 몇번째 주
		// Calendar.WEEK_OF_MONTH 그 달의 몇 번째 주
		// Calendar.DATE 일
		// Calendar.DAY_OF_MONTH 그달의 몇 번째일
		// Calendar.DAY_OF_YEAR 그해의 몇 번째일
		// Calendar.DAY_OF_WEEK 요일
		// Calendar.DAY_OF_WEEK_IN_MONTH 그달의 몇 번째 요일
		
		//시간
		// Calendar.HOUR 12시간제
		// Calendar.HOUR_OF_DAY 24시간제
		// Calendar.MINUTE 분
		// Calendar.SECOND 초
		// Calendar.MILLISECOND 천분의 일초
		// Calendar.ZONE_OFFSET GMT기준 시차
		// Calendar.AM_PM 오전 오후
		
		// 해당월의 마지막날 반환해줌
		int lastDayofMonth = cal.getActualMaximum(Calendar.DATE);
		
		int ampm = cal.get(Calendar.AM_PM);
		System.out.println("AM_PM"+ampm);
		System.out.println(lastDayofMonth);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println("타임존:"+cal.get(Calendar.ZONE_OFFSET)/(60*60*1000));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		SimpleDateFormat sd = new SimpleDateFormat();
		sd.applyPattern("yyyy-MM-dd");
		System.out.println(sd.format(cal.getTime()));
		sd.applyPattern("HH:mm:ss");
		System.out.println(sd.format(cal.getTime()));
		System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH);
		
	}
}
