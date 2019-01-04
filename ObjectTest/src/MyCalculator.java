//샘코드 보고 다시 짜기
public class MyCalculator {

//	속성
	double sum;
	double subtract;
	double multiply;
	double devide;

//	기능

	int sum(int num1, int num2) {
		int sum = num1 + num2;
//		System.out.println("int num1 + int num2 = " + sum);
		return sum;
	}
	
	double sum(double num1, double num2) {
		double sum = num1 + num2;
//		System.out.println("double num1 + double num2 = " + sum);
		return sum;
	}

	int subtract(int num1, int num2) {
		int subtract = num1 - num2;
//		System.out.println("int num1 - int num2 = " + subtract);
		return subtract;
	}
	
	double subtract(double num1, double num2) {
		double subtract = num1 - num2;
//		System.out.println("double num1 - double num2 = " + subtract);
		return subtract;
	}

	
	
	int multiply(int num1, int num2) {
		int multiply = num1 * num2;
//		System.out.println("int num1 * int num2 = " + multiply);
		return multiply;
	}
	
	
	double multiply(double num1, double num2) {
		double multiply = num1 * num2;
//		System.out.println("double num1 * double num2 = " + multiply);
		return multiply;
	}
	
	
	int devide(int num1,int num2) {
		int devide = num1 / num2;
//		System.out.println("int num1 /int num2 = " + devide);
		return devide;
	}
	
	double devide(double num1, double num2) {
		double devide = num1 / num2;
//		System.out.println("double num1 / double num2 = " + devide);
		return devide;
	}

	
	}

