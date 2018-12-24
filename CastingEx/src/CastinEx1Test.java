
public class CastinEx1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//
//int n 
//double doubleNum = 10의 자리수.소수3째자리
//실수형 변수의 값을 변수 n에 담는다.
//n을 출력한다
//n의 값을 doubleNum에 할당(대입)(=)한다.
//doubleNum을 출력한다

		double doubleNum = 73.123;
		int n = 0;
		
		n =	(int)doubleNum;
		
		System.out.println(n);
	
		doubleNum = (double)n;
		
		System.out.println(doubleNum);
		
	}

}
