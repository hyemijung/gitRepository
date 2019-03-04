import java.util.ArrayList;

public class ListEx1 {
	public static void main(String[] args) {

		ListUtil lu = new ListUtil();
		ArrayList list = new ArrayList();

		list.add(1);
		list.add(2);
		list.add("당연하지:");
		
		
		lu.arrayListAllPrint(list, "list");
		
//		백업 복제
		
//		ArrayList listCopy = list;   // 잘못된 복제방법 //이렇게하면 참조주소가 같아지므로 결국 둘은 같은것을 가르킨다(복제가 아니라)
		
		ArrayList listCopy = null;   // 제대로 복제하는 방법
		listCopy = new ArrayList();  // 물건이 만들어져야, 이 아래에 .해서 필요한것 불러서 사용가능
		
		
		listCopy = (ArrayList)list.clone(); // 클론을 하면 list를 기준으로 그 값들을 new하여 값을 복제하여 list주소가 아닌 새 주소에 할당시키고, 새주소를 반환해준다
				// 마직막 리턴값이 오브젝트이므로 ArrayList로 형변환해준다
		
		
		list.add("새로운 내용");	
		listCopy.add("달라");
		
		
		
		lu.arrayListAllPrint(listCopy, "listCopy");
		

		lu.arrayListAllPrint(list, "list");				
		lu.arrayListAllPrint(listCopy, "listCopy");
		
	
		
		
		
		
	}

}
