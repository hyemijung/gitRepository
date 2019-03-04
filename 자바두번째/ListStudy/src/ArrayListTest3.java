import java.util.ArrayList;

public class ArrayListTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		혜선씨가 팀소개 실습 해결한 방법
//		클래스를 따로 만들어서 해결함
		
		ArrayList list = new ArrayList();

		TeamPerson tp = new TeamPerson(3, "장훈일", 30);
		TeamPerson tp2 = new TeamPerson(3, "김충현", 25);
		
//		tp.printInfo();
		
		list.add(tp); //tp를 오브젝트타입으로 형변환한후 add하여 리스트에 저장된것
		list.add(tp2);
		
		
		
		// 위에것은 아래의것을 보기좋게 풀어서 따로 객체를 만들어 매개변수를 던지는 것
//		list.add(new TeamPerson(3, "장훈일", 30));
//		list.add(new TeamPerson(3, "김충현", 25));

		
		
		
		
//		for (int i = 0; i < list.size(); i++) {
//			((TeamPerson)list.get(i)).printInfo(); // 수행순서 list.get(i) -> (TeamPerson)list.get(i) -> .printInfo()
//		}											// 괄호가 꼭 있어야 한다!!(없으면 수행순서가 엉망이되어버림)

		//위의 for문을 풀어쓴것
		TeamPerson tempTp = null;
		for (int i = 0; i < list.size(); i++) {
			tempTp = (TeamPerson)list.get(i);  //get을 통해 주소값을 가져옴(tp를 가져온게아니라 오브젝트(부모)를 가져온것) // 다형성의 힘!!!
											// tempTp에 담기위해 TeamPerson 타입으로 다시 형변환해준 것 
			System.out.println();
			tempTp.printInfo();				// get해서 형변환을 하면 사용자정의 타입도 사용이 가능함을 알수있다
			
		}
		
		
		
		
	}

}
