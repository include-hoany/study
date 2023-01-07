package ch02;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		
		// 스캐너 객체 생성
		Scanner scanner = new Scanner(System.in);
		
		// 인트값으로 입력받기
//		int num = scanner.nextInt();
//		int num2 = scanner.nextInt();
//		System.out.println(num);		
		
//		String input = scanner.nextLine();
//		int num = Integer.parseUnsignedInt(input);
//		System.out.printf("%#X%n", num);
//		scanner.close();
		
		
		int tempIntMax =  Integer.MAX_VALUE; //0x7fffffff;
		String temp = printBinary(tempIntMax);
		int tempParser = Integer.parseInt(temp, 2);
		System.out.println(temp);
		System.out.println(tempParser);

		

		

	}
	
	public static int getZeroLength(int binaryLen) {
		return 32 - binaryLen;
	}
	
	
	public static String insertZero(int len) {
		String temp = "";
		for(int i = 0; i < len; i++) {
			temp += "0";
		}
		return temp;
	}
	
	public static String printBinary(int number) {
		String result = Integer.toBinaryString(number);
		if(result.length() < 32) {
			result = insertZero(getZeroLength(result.length())) + result;
		}		
		return result;
	}

}