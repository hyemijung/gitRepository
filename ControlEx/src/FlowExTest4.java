import java.util.Scanner;

public class FlowExTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 선언부(
		
		
		Scanner scan = new Scanner(System.in);
		int score = 0;

		System.out.println("자신의  점수를 입력해주세요");
		score = scan.nextInt();

//		if(score > 100 ) {
//			System.out.println("100을 초과해서는 안됩니다"); //유연성 처리
//		}
		if (score >= 90 && score < 100) {     //변수명을 먼저적고 비교 연산하고
			System.out.println(score + "점은 A");
		} else if (score >= 80 && score < 90) {
			System.out.println(score + "점은 B");
		} else if (score >= 70 && score < 80) {
			System.out.println(score + "점은 C");
		} else {
			System.out.println(score + "점은 F");
		}

		scan.close();

	}

}
