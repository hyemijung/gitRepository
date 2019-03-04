import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListUtil lu = new ListUtil();
		ArrayList list = new ArrayList();
		
		list.add(new Integer(1));  
		list.add(new Integer(6));
		list.add(new Integer(3));
		list.add(new Integer(2));
		list.add(new Integer(4));
		list.add(new Integer(5));
				
		 // 1
		lu.arrayListAllPrint(list);   //list 전체를 출력한다
		
		
		ArrayList list2 = new ArrayList(list.subList(1, 4));
		
		 // 2
//		lu.arrayListAllPrint(list2);  
		
		
//		sort - static 메서드(한번도 new하지 않고도 static이므로 사용가능)
		Collections.sort(list);   	// list가 실제로 변한다(원본 list가 존재하지않음)
		Collections.sort(list2);

		
		
		// 3
//		lu.arrayListAllPrint(list); 	// sort 한후 list를 출력하니 sort한 이후의 결과로 정렬되어 나옴
		// 4
//		lu.arrayListAllPrint(list2);	
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); //(인덱스의 위치, "넣을 값")
		
		// 5
//		lu.arrayListAllPrint(list2);	
		
		list2.set(3, "AA");  		// set 으로 덮어 씌우기
		
		// 6
//		lu.arrayListAllPrint(list);		
		// 7
//		lu.arrayListAllPrint(list2);	
		
		
		
		
		
		
		
		
		
	}

}
