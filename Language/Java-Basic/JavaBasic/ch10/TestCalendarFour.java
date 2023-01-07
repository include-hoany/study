package ch10;
import java.util.Calendar;
import java.util.Scanner;
public class TestCalendarFour {
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("선택연도>>> ");
		int year = Integer.parseInt(sc.nextLine());
		System.out.print("선택월>>> ");
		int month = Integer.parseInt(sc.nextLine());
		
		int START_DAY_OF_WEEK = 0; // 1일의 요일
		int END_DAY = 0;
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
	
		// 월의 경우 0부터 11까지의 값을 가지므로 1을 빼주면 구하기쉬움
		// 예를들어 10월 1일에서 -1일을 빼면 9월의 마지막 일을 구할 수 있다.
		sDay.clear();
		eDay.clear();
		
		sDay.set(year, month-1, 1);
		eDay.set(year, month, 1);
		eDay.add(Calendar.DATE, -1);
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		END_DAY = eDay.get(Calendar.DATE);
		
		System.out.println("       " + year + "년 " + month + "월");
		System.out.println(" SU MO TU WE TH FR SA");
		
		//해당 월의 1일이 어느 요일인지 따라서 공백을 출력한다.
		//만일 1일이 수요일이라면 공백을 세 번 찍는다. (일요일부터 시작)
		for(int i = 1; i < START_DAY_OF_WEEK; i++) {
			System.out.print("   ");
		}
		
		for(int i = 1, n=START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
			System.out.print((i < 10)? "  "+i : " "+i);
			if(n%7 == 0) System.out.println();
		}
	
	}

}
