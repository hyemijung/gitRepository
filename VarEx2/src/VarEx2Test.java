
public class VarEx2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 400;
		int num2 = 300;
		int num3 = 200;
		int tmp1 = 0;
		int tmp2 = 0;
		int tmp3 = 0;
		System.out.println("num1:" + num1 + " / num2:" + num2 + " / num3:" + num3);
		System.out.println();
		
		tmp1 = num1;
		tmp2 = num2;
		tmp3 = num3;
		num1 = tmp2;
		num2 = tmp1;
		System.out.println("num1:" + num1 + " / num2:" + num2 + " / num3:" + num3);
		System.out.println();
		
		num1 = tmp2;
		num2 = tmp3;
		num3 = tmp1;
		System.out.println("num1:" + num1 + " / num2:" + num2 + " / num3:" + num3);
		System.out.println();
		
		num1 = tmp3;
		num2 = tmp2;
		num3 = tmp1;
		System.out.println("num1:" + num1 + " / num2:" + num2 + " / num3:" + num3);

	}

}
