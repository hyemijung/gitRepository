import java.util.Scanner;

public class TriangleOperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      삼항연산자
//		표현식
//		(조건식) ? 식1 : 식2
//		ex: 변수= (조건식) ? 식1 : 식2;
 		int x = 0;
 		
 		Scanner scan = new Scanner(System.in); 
 		 				
		x =  scan.nextInt();
				
		int absX = (x >= 0) ? x : -x; // -> asbX = X;
				
		System.out.println("x= 10일 때, x의 절대값은 " + absX);
		
		
		
	
	}

}
