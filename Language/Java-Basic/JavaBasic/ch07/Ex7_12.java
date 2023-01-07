package ch07;

public class Ex7_12 {
	class InstanceInner {
		int iv = 100;
		final static int CONST = 100;
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 200;
	}
	
	void myMethod() {
		class LocalInner {
			int iv = 300;
			final static int CONST = 300;
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
//		System.out.println(LocalInner.CONST); 지역 내부 클래스는 메서드 내에서만 사용 가능
	}

}
