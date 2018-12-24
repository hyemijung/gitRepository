
public class VarEx2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int tmp; // 선언문 , 한다면  변수 tmp may not be iniciated 라고 오류뜸
//		그래서 tmp = 0 디폴트값을 성정해 준다.
		int num1 = 400;
		int num2 = 300;
		int num3 = 200;
		int tmp = 0;

		System.out.println("num1 " + num1);
		System.out.println("num2 " + num2);
		System.out.println("num3 " + num3);
		
		tmp = num1;
		num1 = num2;
		num2 = tmp;
		num3 = num3; //�����ǵ� �ǹ̾��� ������ �� �ϴ���
	
		System.out.println();
		System.out.println("num1 " + num1);
		System.out.println("num2 " + num2);
		System.out.println("num3 " + num3);
		
		tmp = num2;
		num2 = num3;
		num3 = tmp;
		
		System.out.println();
		System.out.println("num1 " + num1);
		System.out.println("num2 " + num2);
		System.out.println("num3 " + num3);
		
		tmp = num1;
		num1 = num2;
		num2 = tmp;
		
		System.out.println();
		System.out.println("num1 " + num1);
		System.out.println("num2 " + num2);
		System.out.println("num3 " + num3);
		
	}

}
