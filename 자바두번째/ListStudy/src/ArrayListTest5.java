import java.util.ArrayList;

public class ArrayListTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		ArrayList teamPersonList = new ArrayList<TeamPerson>();  // 이건 잘못된 방법
//		ArrayList<TeamPerson> teamPersonList = new ArrayList<TeamPerson>();		// 처음에는(1.6버전) 변수명에도, new해서 만들어지는것도 제너릭스 다 붙여줘야했음
		ArrayList<TeamPerson> teamPersonList = new ArrayList();   // 1.7버전부터는 이 방식으로 사용해도 된다


		TeamPerson tp = new TeamPerson(3, "장훈일", 30);
		TeamPerson tp2 = new TeamPerson(3, "김충현", 25);

		teamPersonList.add(tp);
		teamPersonList.add(tp2);

		for (int i = 0; i < teamPersonList.size(); i++) {
			teamPersonList.get(i).printInfo(); // 제너릭스를 통한 형변환이 필요없어짐
			System.out.println();
		}
		
		// 팀원의 나이를 바꾸기
		
		TeamPerson tempTeamPerson = null;
		int tempAge = 0;
		for (int i = 0; i < teamPersonList.size(); i++) {
			tempTeamPerson = teamPersonList.get(i);
			tempAge = tempTeamPerson.getAge();
			
			teamPersonList.get(i).setAge(tempAge + 1);
			
		}
		

		for (int i = 0; i < teamPersonList.size(); i++) {
			teamPersonList.get(i).printInfo();
			System.out.println();
		}
		
	}

}
