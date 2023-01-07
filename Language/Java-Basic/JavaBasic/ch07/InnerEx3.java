package ch07;

public class InnerEx3 {
	public static void main(String[] args) {
	
		Object iv = new Object() { void method() {System.out.println("뭐야이거.");} };
		
	}
	
	void myMethod() {
		int iv = 0;
		final int LV = 0;
		iv = 1; // 값 변경시도
		
		class LocalInner {
			// int liv3 = iv;  파일 에러 발생
			int liv4 = LV;
		}
	}

}
