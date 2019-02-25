
// 100을 0~10까지의 랜덤한 수로 10번 나누는
// 프로그램을 작성하시오

// 	나눠지다보며 0으로 나눠지게 되는경우가 있을것인데
// (오류가 발생하지 않도록 처리하시오)
public class ExceptionEx1Test_2 {
	public static void main(String[] args) {

//	지원씨 코드 + 샘수정
		int num = 100;
		int devideResult = 0;
		int random = 0;
		
		for (int i = 0; i < 10; i++) {
			
			try {
				random = (int) (Math.random() * 10);
				devideResult = num / random;
				System.out.println((i + 1) + "번째 수행: " + num + " / " + random + " = " + devideResult);
			} catch (ArithmeticException e) {
//				System.out.println((i + 1) + "번째 수행: 산술연산(논리적인) 오류가 발생해서 예외처리함");
//				System.out.println(num + "의 값을 " + random + "값으로 나누면 안됨");
//				System.out.println("0 이외의 숫자로 나누어 주십시오");
//				break;   			 // break 가 있으면 문제가 발생하면 멈추고 더이상 for문이 수행되지 않는다 (혜선씨) 
				System.out.println((i + 1) + "번째 수행: " + num + " / " + random + " = " + num);  //예외처리에 따라 일반사용자가 어떻게 오류를 받아들일지 생각하고 어떻게 보여줄지 선택하면 된다 
			}
			
		}
		System.out.println("반복문 종료가 된거지 catch가 발생했다고 해서 중간에 종료가 된게 아니잖아요");
		

//		오류가 발생해도 문제없이 이후의 것들이 이루어져야한다
//		break 문이 여기선 있어서는 안된다
		
		
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
