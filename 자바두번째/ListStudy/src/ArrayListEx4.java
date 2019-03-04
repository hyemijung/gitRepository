import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx4 {

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
				
//		list.add("객체의 존재유무 알림");
		list.add(lu);
		
		lu.arrayListAllPrint(list);
		
		
		// contain 안에 어떤 객체가 있는지 찾을수 있다(안의 내용을 포함여부를 조사할수 있다)
//		System.out.println(list.contains(lu));
//		System.out.println(list.contains("객체의 존재유무 알림"));
		
//		System.out.println(list.indexOf(lu));   // lu가 있는 인덱스 위치 알려줌
		
		System.out.println(list.isEmpty());    // 값의 존재유무
		list.clear();
		System.out.println(list.size());
		System.out.println(list.isEmpty());    // 값이 하나도 없을때 true 를 반환
		
		
		
		
		
		
		
	}

}
