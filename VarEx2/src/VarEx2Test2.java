
public class VarEx2Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 300;
		int num2 = 400;
		int num3 = 200;
		int tmp1 = 200;
		int tmp2 = 3000;
		int tmp3 = 400;
		System.out.println("num1:" + num1 + " / num2:" + num2 + " / num3:" + num3);
		
		tmp1 = num1;
		tmp2 = num2;
		tmp3 = num3;
		num2 = tmp3;
		num3 = 3000;
		System.out.println("num1:" + num1 + " / num2:" + num2 + " / num3:" + num3);
		
		num1 = tmp3;
		num2 = tmp1;
		num3 = 3000;
		System.out.println("num1:" + num1 + " / num2:" + num2 + " / num3:" + num3);

		
	}

}
