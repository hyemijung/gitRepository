
public class CastingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 자동 형변환
//		 자동 형변환의 규칙
//		 기존의 값을 최대한 보존할 수 있는 타입으로 자동 형변환한다.
//	      1       2       4      8       4        8	
//		byte -> short -> int -> long -> float -> double
//		char -> 
//		묵시적 형변환 (값의 손실이 없다)
//		명시적 형변환 (값의 손실이 있지만 그 결과가 원하는 결과라고 compiler에게 알려준다)
		
		/*
		 * 1. boolean(논리형:ture,false라서)을 제외한 나머지 7개의 기본형은 서로 형변환이 가능하다 
		 * 2. 서로 다른 타입의 변수간의 연산은 형변환을 하는 것이 원칙이지만,
		 *  값의 범위가 작은 타입에서 큰 타입으로 형변환은 생략할수있다.
		 */
		
		
		
		double doubleNum = 0.0;
//		int num = 0.1;    이건 에런데 아래는 왜 에러가 아닌가?
		doubleNum = 10;  // double은 가장 큰 그릇이므로 int, long, float 값은 충분히 다들어간다
		
		long bigNum = (long)321234324; // 작은값에서 큰값으로 간다는것은 묵시적 형변환을 자동으로 해준다
		int bigNum2 = (int)32123212412L;   	// 왼쪽값보다 오른쪽값이 크면 손실이 발생한다(큰값을 작은값으로 바꾸려면 이유가있음을 형변환으로 표현해야한다)
		
		System.out.println(bigNum2);
		System.out.println(doubleNum);
		
		
		
	}

}
