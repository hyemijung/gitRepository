import java.util.ArrayList;

public class ListEx7Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//혜선씨 코드
		
//		자신의 팀원의 정보는 TeamPerson.java 를 이용하여
//		자신의 팀원을 list에 저장한다
//
//		새로운 list에 팀원의 정보를 복제한다
//		복제한 팀원의 정보는 나이만 1살씩만 어리게 작성해서 출력하시오
		
		
		 ArrayList list  = new ArrayList();
	      
	      
	      TeamPerson tp = new TeamPerson(3, "장훈일", 30);
	      TeamPerson tp2 = new TeamPerson(3, "김충현", 25);
	      
	      list.add(tp);
	      list.add(tp2);
	      
	      ArrayList listCopy  = new ArrayList();
	      
	      
	      for(int i = 0; i < list.size(); i++) {
	         listCopy.add(list.get(i));
	      }
	      
	      
//	      for(int i = 0; i < list.size(); i++) {
//	         System.out.println(list.get(i).);
//	      }
	      
//	      TeamPerson tempTp = null;
//	      for(int i = 0; i < list.size(); i++) {
//	         tempTp = (TeamPerson)list.get(i);
//	         
//	         System.out.println();
//	         tempTp.printInfo();
//	      }
	      
//	      
	      
	      for(int i = 0; i < list.size(); i++) {
	         int newAge = (((TeamPerson)list.get(i)).getAge())+1;
	         ((TeamPerson)listCopy.get(i)).setAge(newAge);
	      }
	      
	      for(int i = 0; i < listCopy.size(); i++) {
	         ((TeamPerson)listCopy.get(i)).printInfo();
	         System.out.println();
	      
	      }


	}

}
