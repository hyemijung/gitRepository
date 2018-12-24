
public class OperEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		논리연산자
//		|(shift+역슬래쉬) or 연산자 , & and 연산자
		int n = 0;
	
		n = 10;
//	10 / 2 == 5
//		 사칙연산 하고 비교 연산한다
//	System.out.println(n % 2 == 0 || n % 3 == 0);
//	
//	System.out.println(n % 2 == 0 && n % 3 == 0); //true $$ false // false
		
		System.out.println(n++ % 2 == 0 || n++ % 3 == 0);
		System.out.println(++n % 2 == 0 && ++n % 3 == 0);
	}

}
