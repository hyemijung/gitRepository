import java.util.ArrayList;

public class ListEx7Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 강사님 파일 ListEx2 도 가져와서 봐라!!!!!!!!!!!!! tempTp 객체 만들어서 하신것!!!!
		// 준혁씨 코드

//		자신의 팀원의 정보는 TeamPerson.java 를 이용하여
//		자신의 팀원을 list에 저장한다
//
//		새로운 list에 팀원의 정보를 복제한다
//		복제한 팀원의 정보는 나이만 1살씩만 어리게 작성해서 출력하시오
		
		int fisrtPersonAge = 30;
		int secondPersonAge = 30;
		int thirdPersonAge = 30;
		// 3명 사람만들고 초기화
		TeamPerson tp = new TeamPerson(1, "장훈일", fisrtPersonAge);   	//0000
		TeamPerson tp2 = new TeamPerson(2, "조혜선", secondPersonAge);	//1111
		TeamPerson tp3 = new TeamPerson(3, "김충현", thirdPersonAge);		//2222
		ArrayList list = new ArrayList();	// 9999

		TeamPerson tempTp = new TeamPerson();
		
		tempTp.setAge(tp.getAge());
		tempTp.setTeamNo(tp.getTeamNo());
		tempTp.setName(tp.getName());
		
		// 9999
		list.add(tp);         //0000
		list.add(tp2);        //1111   
		list.add(tp3);        //2222

		tp.setAge(fisrtPersonAge - 1);
		tp2.setAge(secondPersonAge - 1);
		tp3.setAge(thirdPersonAge - 1);

		ArrayList listCopy = new ArrayList();  //8888

		for (int i = 0; i < list.size(); i++) {		//9999
			((TeamPerson) list.get(i)).printInfo();  //0000, 1111, 2222
		}
		
		
		System.out.println();
		System.out.println("복제한 내용들");
		System.out.println();
		
		
		
		for (int i = 0; i < list.size(); i++) {    //8888
			listCopy.add(list.get(i));			// 9999 안에 -> 0000, 1111, 2222 // 오브젝트는 리턴하면 주소값
		}

		listCopy.add(123);
		
		System.out.println("새롭게 추가했다 복제한 8888영역에");
		
		for (int i = 0; i < list.size(); i++) {		//9999
			((TeamPerson) list.get(i)).printInfo();  //0000, 1111, 2222
		}
		
		System.out.println("list.size()는 : " + list.size());
		
		for (int i = 0; i < listCopy.size(); i++) {		// 8888
			((TeamPerson) listCopy.get(i)).printInfo();  // get(i)를 통해 -> 0000, 1111, 2222
		}

		
		System.out.println("listCopy.size()는 : " + listCopy.get(listCopy.size()-1));  // 0000, 1111, 2222
		
		
		
		
	}

}
