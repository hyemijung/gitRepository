
// 오버로딩
//메서드도 변수와 마찬가지로 같은 클래스 내에서 서로 구별될 수 있어야하기 때문에 
//각기 다른 이름을 가져야한다
//한 클래스 내에 같은 이름의 메서드를 여러 개 정의 하는 것을 '메서드 오버로딩' 또는 
//간단히 '오버로딩(Overloading)'이라 한다

//오버로딩 조건
//1. 메서드 이름이 같아야 한다
//2. 매개변수의 개수 또는  타입이 달라야 한다
//단, 반환 타입은 오버로딩을 구현하는데 아무런 영향을 주지않는다

//오버로딩의 장점

//println()
//printInInt(int x)
//PrintInDouble(double x)
//모두 근본적으로는 같은 기능을 하는 메서드들이지만, 서로 다른 이름을 가져야 하기 때문에
//메서드를 작성하는 쪽에서는 이름을 짓기도 어렵고, 메서드를 사용하는 쪽에서는 이름을
//일일이 구분해서 기억해야하기 때문에 서로 부담이 된다
//
//하지만 오버로딩을 통해 여러 메서드들이 println이라는 하나의 이름으로 정의된다면
//println이라는 이름만 기억하면 되므로 기억하기도 쉽고 이름도 짧게 할 수 있어서 
//오류의 가능성을 많이 줄일 수 있다. 그리고 메서드의 이름만 보고도
//'이 메서드들은 이름이 같으니, 같은 기능을  하겠구나'라고 쉽게 예측할 수 있다
//
//또 하나의 장점은 메서드의 이름을 절약할 수 있다는 것이다. 하나의 이름으로 여러 개의 
//메서드를 정의 할수 있으니, 메서드의 이름을 짓는데 고민을 덜 수 있는 동시에 사용되었어야 할
//메서드의 이름으로 사용할 수 있기 때문이다

public class Mycalc {

	

	int add(int[] numArr) {
//		int[] numArr = new int[4];
		int sum = 0;

//		for (int i = 0; i < numArr.length; i++) {  // 사용자 입력을 밖에서 하니 주석처리
//			numArr[i] = (i+1) * 100;
//			
//		}

//		numArr[0] = 100;
//		numArr[1] = 200;
//		numArr[2] = 300;
//		numArr[3] = 400;

		for (int i = 0; i < numArr.length; i++) {
			sum = sum + numArr[i];
		}

//		sum = sum + numArr[0];
//		sum = sum + numArr[1];
//		sum = sum + numArr[2];
//		sum = sum + numArr[3];

//		System.out.println(sum);
		return sum;
	}
}













//	
//	
//	int add(int x, int y) {
//		int sum = x + y;
//
//		System.out.println("int add(int x, int y) = ");
//		return sum;
//	 }
//
//	long add(long x, long y) {
//		long sum = x + y;
//
//		System.out.println("long add(long x, long y) = ");
//		return sum;
//	}
//
//}
