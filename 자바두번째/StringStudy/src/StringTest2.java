import java.util.Scanner;

public class StringTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String str = "";

		while (true) {
			System.out.println("아무글자나 입력해주세요");
			System.out.print("enter:)");
			str = scan.nextLine();

			if (str.equals("정혜미")) {       //	if (str == "정혜미") 해서는 안된다
				break;
			}
			System.out.println("틀렸습니다. 다시 입력해 주세요");
		}
		System.out.println("게임을 종료합니다");
	}
}
