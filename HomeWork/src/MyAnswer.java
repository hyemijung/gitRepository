import java.util.Scanner;



public class MyAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  	키보드 입력을한다
//		a 또는 A일때 정답입니다를 나오게한다
//		틀렸을때는 틀렸습니다라고 나오게한다.
//		  출력결과
//		"A또는A를 입력해주세요.	
//		A,a 
//		정답입니다.
//		다른 값
//		틀렸습니다.	

		
		Scanner scan = new Scanner(System.in);

		String str = "";

		System.out.println("A 또는 a를 입력해주세요");
		
		str = scan.next();
		
		
//		방법 1
		
		if (str.equals("A") || str.equals("a")) {
			System.out.println("정답입니다");
		}else {
			System.out.println("틀렸습니다");
		}


//		방법 2
		
		if (str.equals("A")) {
		System.out.println("정답입니다");
		} else if (str.equals("a")) {
			System.out.println("정답입니다");
		} else {
			System.out.println("틀렸습니다");
		}
				
		
		
		
//처음 틀리것, 이유? 문자열 비교는 == 이 아니라 str.equals("A") 라는 메서드를 사용해야한다		
		
//		if (str == "A") {
//			System.out.println("정답입니다");
//		} else if (str == "a") {
//			System.out.println("정답입니다");
//		} else {
//			System.out.println("틀렸습니다");
//		}
		

	}

}
