
public class MyMathTest {

	public static void main(String[] args) {
		
		long result = 0;
		
		result = MyMath.add(30, 50);
		System.out.println("MyMath.add(30, 50): " + result );
		
		result = MyMath.subtract(30, 50);
		System.out.println("MyMath.subtract(30, 50): " + result );
		
		MyMath math = new MyMath();
		
		
		
		math.num1 = 3;
		math.num2 = 5;
	
		
		result = math.add();
		
		System.out.println("math.add(): " + result);
		
		result = math.subtract();
		
		System.out.println("math.subtract(): " + result);
		
	}
}
