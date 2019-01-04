//샘코드 보고 다시 짜기
import java.util.Scanner;

public class MyCalculatorTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		MyCalculator mc = new MyCalculator();

		int num1 = 0;
		int num2 = 0;
		int result = 0;
		double doubleResult = 0.0;
		
		System.out.println("정수만 입력해주세요");
		num1 = scan.nextInt();
		System.out.println("정수만를 입력해주세요");
		num2 = scan.nextInt();

		result = mc.sum(num1, num2); // 호출
		System.out.println(result);

		result = mc.subtract(num1, num2);
		System.out.println(result);
		
		result = mc. multiply(num1, num2);
		System.out.println(result);
		
		doubleResult = mc.devide(num1, num2);
		System.out.println(doubleResult);
		
		
		
		double dNum1 = 0;
		double dNum2 = 0;
		double dResult = 0;
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("첫번째 숫자 + 두번째 숫자 = " + mc.sum);
//		System.out.println("첫번째 숫자 - 두번째 숫자 = " + mc.subtract);
//		System.out.println("첫번째 숫자 * 두번째 숫자 = " + mc.multiply);
//		System.out.println("첫번째 숫자 / 두번째 숫자 = " + mc.devide);
//
//		System.out.println();
//
//		System.out.println("실수만 입력해주세요");
//		num1 = scan.nextDouble();
//		System.out.println("실수만를 입력해주세요");
//		num2 = scan.nextDouble();

	}

}
