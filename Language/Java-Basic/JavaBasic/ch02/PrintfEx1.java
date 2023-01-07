package ch02;

public class PrintfEx1 {

	public static void main(String[] args) {
		// println 단점 출력형식 지정불가.
		System.out.println(10.0/3);
		// 10진수로만 출력된다 8진수 16진수 출력 불가능
		System.out.println(0x1A);
		
		
		//printf는 출력형식 지정가능
		System.out.printf("%.2f\n", 10.0/3); // 소수점 둘째자리수 까지만.
		System.out.printf("%d\n", 0x1A);
		System.out.printf("%X", 0x1A);
		
		// %b 불리언 형식으로 출력
		// %d 10진수 정수의 형식으로 출력
		// %o 8진수 정수의 형식으로 출력
		// %x, %X 16진정수의 형식으로 출력
		//  %f 부동소수점의 형식으로 출력
		// %e, %E 지수 표현식의 형식으로 출력
		// %c  문자로 출력
		// %s 문자열로 출력
		
		// %n 개행문자 \n과 같지만 \n은 os마다 다를수 있음 %n추
		
		System.out.printf("%d%n", 15);
		System.out.printf("%o%n", 15);
		System.out.printf("%x%n", 15);
		
		// 단 이진수 표현은 없다 그래서 다과 같은 형식으로 문자열로 표기
		System.out.printf("%s%n", Integer.toBinaryString(15));
		
		// 8진수 16진수에 접두사 붙이기 0x, o
		System.out.printf("%#o%n", 15);
		System.out.printf("%#x%n", 15);
		System.out.printf("%#X%n", 15);
		
		//실수 출력을 위한 지시자 %f -지수형식 %e 간략한 형식 %g
		float f = 123.4567890f;
		System.out.printf("%f%n", f);
		System.out.printf("%e%n", f);
		
		
		// printf() 지시자
		System.out.printf("[%5d]%n", 10);
		System.out.printf("[%-5d]%n", 10);
		System.out.printf("[%05d]%n", 10);
		
		// 소수점 %전체자리.소수점아래자리f
		double fi = 3.14;
		System.out.printf("%14.6f%n", fi);
		
		
		// 문자열 지시자
		String url = "www.codechobo.com";
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url);
		System.out.printf("[%.8s]%n", url);
		
		
		// 더 많은 표현식 JavaAPI -> Formatter 찾아보기.

	}

}
