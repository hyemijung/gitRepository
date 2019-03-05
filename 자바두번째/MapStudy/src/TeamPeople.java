import java.util.HashMap;
import java.util.Scanner;

public class TeamPeople {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> teamPeopleMap = new HashMap();

		teamPeopleMap.put("mk", "이명선");
		teamPeopleMap.put("jw", "송지원");
		teamPeopleMap.put("mg", "최문권");

		Scanner scan = new Scanner(System.in);

		System.out.println("이름을 알고싶은 동기의 별명을 입력해주세요");

		String nickName = "";
//		String name = "";

		while (true) {
			System.out.println("동기의 별명을 입력해주세요");
			System.out.print("별명: ");

			nickName = scan.nextLine().trim();

//	         System.out.print("이름: ");
//	         name = scan.nextLine().trim();
//	         System.out.println();

			
			//containsKey를 사용하지말라!!!(회사에서 안쓴다!!)
			if (!teamPeopleMap.containsKey(nickName)) {  // containkey의 리턴값은 boolean
						// containKey를 사용하면 별명이 존재하느냐와, 존재했을때 별명이 내가 입력한 별명과 일치하는지 - 두가지를 한꺼번에 해주는것 따라서 equals를 이후에 따로 할 필요하가 없다
				System.out.println("입력하신 별명은 존재하지 않습니다");
				System.out.println("별명을 다시 입력해주세요");
				continue;
			}

			else {
				System.out.println("별명과 이름이 일치합니다.");
				System.out.println("별명: " + nickName);
				System.out.println("이름: " + teamPeopleMap.get(nickName));
				break;
			}

		}

	}

}
