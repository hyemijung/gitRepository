import java.util.ArrayList;

public class ListEx7 {
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
		
		listCopy.add(list.get(0));	// 안의 내용을 하나하나 접근해야 복제가 되는것이다
		listCopy.add(list.get(1));
		listCopy.add(list.get(2));
		
		
		lu.arrayListAllPrint(listCopy, "listCopy");
		
//		listCopy.add("잘못된 복제");
//		list.remove(0);
		
		lu.arrayListAllPrint(list, "list");				// list에도 잘못된 복제 내용이 출력됨 // 참조 주소를 가져왔기때문에 list와 listCopy는 한몸이다
		lu.arrayListAllPrint(listCopy, "listCopy");
		
		// 그럼 어떻게 올바르게 복제할것인가?
		
		
		
		
	}

}
