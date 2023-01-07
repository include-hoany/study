package ch10;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class ch10_9 {
	public static void main(String[] args) throws ParseException {
//		double number = 1234567.89;
//		//지수형식으로 표현
//		DecimalFormat df = new DecimalFormat("#.#E0");
//		String result = df.format(number);
//		System.out.println(result);
//		
//		df = new DecimalFormat("#,###.##");
//		Number num = df.parse("1,234,567.89");
//		double d = num.doubleValue();
//		System.out.println(d);
		
		// 111,111,111.09;
		// ,가 있는 문자는 parser로 형변환시 에러발생
		// 그래서 DecimalFormat로 받아줘야한다 
		DecimalFormat df = new DecimalFormat("#,###.##");
		DecimalFormat df2 = new DecimalFormat("#.###E0");
		
		
		try {
			System.out.println(Double.parseDouble("1234567.89"));
			Number num = df.parse("1,234,567.89");
			System.out.print("1,234,567.89 -> ");
			
			
			double d = num.doubleValue();
			System.out.print(d + " -> ");
			System.out.println(df2.format(num));
		} catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
		
//		new Thread(() -> {
//			for(int i = 0; i < 10; i++ ) {
//				try {
//					Thread.sleep(1000);
//					System.out.println(i);
//				} catch(Exception e) {
//					System.out.println(e.getStackTrace());
//				}
//			}
//		}).start();
	}
}
