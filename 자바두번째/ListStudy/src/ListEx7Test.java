import java.util.ArrayList;

public class ListEx7Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		자신의 팀원의 정보는 TeamPerson.java 를 이용하여
//		자신의 팀원을 list에 저장한다
//
//		새로운 list에 팀원의 정보를 복제한다
//		복제한 팀원의 정보는 나이만 1살씩만 어리게 작성해서 출력하시오
		
		
		// 내가 한것- 복제하는 것 까지는 완성했음
		ArrayList list = new ArrayList();

		TeamPerson tp = new TeamPerson(1, "정혜미", 36);
		TeamPerson tp2 = new TeamPerson(2, "정민성", 27);
		TeamPerson tp3 = new TeamPerson(3, "박대승", 25);
		TeamPerson tp4 = new TeamPerson(4, "송지원", 23);

		// 데이터가 완성된게 존재한다
		// list에 TeamPerson객체를 넣는다
		list.add(tp); // 출력하면 주소값이 나옴
		list.add(tp2);
		list.add(tp3);
		list.add(tp4);

		// 완성돤 데이터를 복제한다
		ArrayList listCopy = null; // 제대로 복제하는 방법
		listCopy = new ArrayList();

		listCopy.add(list.get(0)); // 안의 내용을 하나하나 접근해야 복제가 되는것이다
		listCopy.add(list.get(1));
		listCopy.add(list.get(2));
		listCopy.add(list.get(3));

		// 복제된 데이터를 변경한다
		// 나이를 한살씩 어리게 하라

		// 완성된 데이터를 출력

		// 복제된 데이터를 출력 //여기서부터 혜선씨가 도와줌

		for (int i = 0; i < list.size(); i++) {
			int newAge = ((TeamPerson) list.get(0)).getAge() - 1;
			((TeamPerson) listCopy.get(0)).setAge(newAge);
		}

//		tp.printInfo();
//		tp2.printInfo();
//		tp3.printInfo();
//		tp4.printInfo();

		((TeamPerson) listCopy.get(0)).printInfo();

	}

}
