// 클래스 메서드와 인스턴스 메서드

//1. 클래스를 설계할 때, 멤버변수 중 모든 인스턴스에 공통적으로 사용해야하는 것에
//스태틱(static)을 붙인다
//2. 클래서 변수는 인스턴스를 생성하지 않아도 사용할 수 있다
//3. 클래스메서드는 인스턴스변수를 사용할 수 없다
//4. 메서드 내에서 인스턴스 변수를 사용하지 않는다면, static을 붙이는 것을 고려한다

public class MyMath {

	long num1 = 0;
	long num2 = 0;
	
	long add() {
		return num1 + num2;
	}
	
	long subtract() {
		return num1 - num2;
	}
	
	static long add(long n, long m) {
		return n + m;
	}
	
	static long subtract(long n, long m) {
		return n - m;
	}
}
