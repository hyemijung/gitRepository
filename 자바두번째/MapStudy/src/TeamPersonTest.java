import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TeamPersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int teamNo = 0;
		String name = "";
		int age = 0;

		Map<String, TeamPerson> teamPersonMap = new HashMap();

		TeamPerson tp = new TeamPerson(1, "정민성", 26);
		TeamPerson tp2 = new TeamPerson(2, "정혜미", 37);
		TeamPerson tp3 = new TeamPerson(3, "송지원", 23);
		TeamPerson tp4 = new TeamPerson(3, "박대승", 24);

		teamPersonMap.put("ms", tp);
		teamPersonMap.put("hm", tp2);
		teamPersonMap.put("jw", tp3);
		teamPersonMap.put("ds", tp4);
 
		
		
		
		
		
		// 출력(while문의 조건을 true를 이용하면 무한으로 반복할수있다)
		Scanner scan = new Scanner(System.in);
		String searchTeamMember = "";

		while (true) {
			System.out.println("검색하실 팀원 이름의 이니셜을 입력해주세요");
			searchTeamMember = scan.nextLine().trim();
			if (teamPersonMap.get(searchTeamMember) != null) {
				System.out.println(teamPersonMap.get(searchTeamMember));
				
			} else if (teamPersonMap.get(searchTeamMember) == null) {
				System.out.println("다시 한번");

			}
			
		}
		
			
//		// 출력 못해서 명선씨 코드 참고함 (set,entrySet,Iterator 이것들 어떻게 사용하는지 확인해야함)  
//		Set set = teamPersonMap.entrySet();    // 해쉬맵은 Iterator에 바로 넣을수가 없어서 set에 담아서 이후 iterator에서 사용함
//		Iterator it = set.iterator();		// 
//
//		while (it.hasNext()) {
//			System.out.println("검색하실 팀원 이름의 이니셜을 입력해주세요");
//			searchTeamMember = scan.nextLine().trim();
//			if (teamPersonMap.get(searchTeamMember) != null) {
//				System.out.println(teamPersonMap.get(searchTeamMember));
//				it.next();
//			} else if (teamPersonMap.get(searchTeamMember) == null) {
//				System.out.println("검색하실 팀원 이름의 이니셜을 정확히 다시 입력해주세요");
//
//			}
//			
//		}
//		System.out.println("검색을 종료합니다");

	}

}
