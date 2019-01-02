
public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc calc = new Calc();
		
		int result1 = 0;
		int result2 = 0;
		double result3 = 0;
		
		result1 = calc.minus(7, 2);
		result2 = calc.multiply(7, 2);
		result3 = calc.devide(7, 2);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
