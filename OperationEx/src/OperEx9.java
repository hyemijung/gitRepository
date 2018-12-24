import java.util.Scanner;

public class OperEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//비교 연산자
//		>, <, <=, ==, !=
		int num = 0;
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("숫자를 입력해주세요");
		num = scan.nextInt();
		
//		크다, 작다, 초과, 미만 (= 사용 불과)
		System.out.println("2 > 1 결과는: " + (num > 1)); //true //boolin값이됨 무조건 괄호가 우선순위다 문자열 보다
//		크거나 같다, 작거나 같다, 이상, 이하
		System.out.println(num <= 2);  // =< 이런건 없다(=을 먼저적으면 대입연산자로 생각-할당)
//		컴퓨터에서 같다고 말하고 싶을땐 == 사용
		System.out.println(num == 2);
//		!= 다른다
		System.out.println(num != 0);
		
		
		
		
		
	}

}
