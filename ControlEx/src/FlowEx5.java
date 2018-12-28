import java.util.Scanner;

public class FlowEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		중첩 if문 (최대한 지양하자)
//		if(조건식1) {
//			조건식 1의 연산결과가 true일 때 수행될 문장들을 적는다
//			if(조건식2) {
//				조건식 1과 조건식2가 모두 true일 때 수행될 문장들
//			}else{
//				조건식 1 이 true이고 조건식2가 false일 때 수행되는 문장들
//	 		}
//		}else {
//			조건식 1이 false일때 수행되는 문장들
//		}

		Scanner scan = new Scanner(System.in);
		int score = 0;
		String grade = ""; // 문자열 초기화

		System.out.println("자신의  점수를 입력해주세요");
		score = scan.nextInt();

		if (score >= 90) {
			grade = "A";
			
			if (score >= 98) {   //90점은 넘는건 맞는데 좀더 세부적으로 묻는것
				grade = "A+";
			} else if (score < 94) {
				grade = "A-";
			} else if (score >= 80) {
				grade = "B";
				if (score >= 88) {
					grade = "B+";
				} else if (score < 94) {
					grade = "B-";
				}
			} else {
				grade = "F";
			}

		} else {
		}
			System.out.println(score + "점은 " + grade);
		

	}

}
