import java.util.ArrayList;
import java.util.Scanner;

public class Guest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "";
		int age = 0;
		String id = "";
		String idCheck = "";

		ArrayList nameList = new ArrayList();
		ArrayList ageList = new ArrayList();
		ArrayList idList = new ArrayList();
		ArrayList idCheckList = new ArrayList();

//		회원가입
		Scanner scan = new Scanner(System.in);

		System.out.println("회원가입 화면입니다");
		System.out.println("이름을 입력해주세요");
		String scanInput = scan.nextLine().trim();

		nameList.add(scanInput);

		while (true) {
			if (nameList != null) {
				System.out.println("회원가입시 사용할 아이디를 입력해주세요");
				idList.add(scanInput);
			} else if (idList != null) {
				System.out.println("아이디 확인을 위해 위에서 입력한 아이디를 다시 입력해주세요");
				idCheckList.add(scanInput);
			}

			if (idList != idCheckList) {
				System.out.println("입력하신 아이디와 입력하신 아이디확인란의 아이디가 다릅니다");

			}

		}

	}

}
