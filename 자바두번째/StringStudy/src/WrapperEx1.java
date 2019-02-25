import java.util.Scanner;

public class WrapperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String str = "100";
		System.out.println("숫자를 입력해주세요");
		str = scan.nextLine();
		
//		문자열 글자가 들어가 있지 않아야 한다
//		오로지 문자열 안에는 숫자가 들어가 있어야만 사용가능하다
		Integer numObj = new Integer(0);   //아래와 의미 동일
		int n = 0;							//위와 의미 동일 
	
		
		
//		숫자의 값이 입력되면 문자로 바꿔준다
		int num = new Integer("100").intValue();
		System.out.println("숫자를 입력해주세요");
		num = scan.nextInt();
		
		int num2 = Integer.parseInt("str");
		
		Integer num3 = Integer.valueOf("100");
		
//		System.out.println("str= " + "100" * 2);
		System.out.println("num= " + num * 2);
		System.out.println("num2= " + num2 * 2);
		System.out.println("num3= " + num3 * 2);
		
	}

}
