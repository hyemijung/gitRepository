
// 100을 0~10까지의 랜덤한 수로 10번 나누는
// 프로그램을 작성하시오

// 	나눠지다보며 0으로 나눠지게 되는경우가 있을것인데
// (오류가 발생하지 않도록 처리하시오)

//샘코드 // try안에 for문이 있는 이형태가 더좋다
public class ExceptionEx1Test_3 {
	public static void main(String[] args) {

		int num = 100;
		int devideResult = 0;
		int cnt = 0;
		
	
			try {	
				for (int i = 0; i < 10; i++) {
				devideResult = num / (int) (Math.random() * 10);
				System.out.println((i+1) + "번째 수행: " + devideResult);
				}
			} catch (ArithmeticException e) {
				System.out.println((cnt+1) + "번째 수행: 산술연산(논리적인) 오류가 발생해서 예외처리함");
				cnt++;
			}

			

//		System.out.println(100 / 1);
//		System.out.println(100 / 2);
//		System.out.println(100 / 10);
//		System.out.println(100 / 4);

//		System.out.println("1번째 수행: " + 100 / 1);
//		System.out.println("2번째 수행: " + 100 / 2);
//		System.out.println("3번째 수행: " + 100 / 10);
//		System.out.println("4번째 수행: " + 100 / 4);

//		System.out.println("1번째 수행: " + 100 + " / " + 1 + " = " + 100 / 1);
//		System.out.println("2번째 수행: " + 100 / 2);
//		System.out.println("3번째 수행: " + 100 / 10);
//		System.out.println("4번째 수행: " + 100 / 4);

	}
}
