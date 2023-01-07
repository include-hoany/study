package ch10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestSimpleDateFormat {
  public static void main(String[] args) {
  Date today = new Date();
  SimpleDateFormat sdf = new SimpleDateFormat();
  sdf.applyPattern("yyyy년MM월dd일 HH시mm분ss초 E");
  System.out.println(sdf.format(today));
		
  Calendar cal = Calendar.getInstance();
  System.out.println(sdf.format(cal.getTime()));
		
      try {
    	DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
    	DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
    	Date d = df.parse("2019년 11월 23일");
    	System.out.println(df2.format(d));
      } catch (ParseException e) {
    	// TODO Auto-generated catch block
    	e.printStackTrace();
      }
		
		
  }

}
