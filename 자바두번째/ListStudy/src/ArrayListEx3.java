import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx3 {

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
		list.add(new Integer(1));
				
		 // 1
//		lu.arrayListAllPrint(list);   //list 전체를 출력한다
		
		
		ArrayList list2 = new ArrayList(list.subList(1, 4));
		
		 // 2
//		lu.arrayListAllPrint(list2);  
		
		
//		sort - static 메서드(한번도 new하지 않고도 static이므로 사용가능)
		Collections.sort(list);   	// list가 실제로 변한다(원본 list가 존재하지않음)
		Collections.sort(list2);
//		String str = "123";				// 123
//		String tempStr = str.substring(1);   // 23 // str 자체가 변화한것은 아님
		
		
		
		// 3
//		lu.arrayListAllPrint(list); 	// sort 한후 list를 출력하니 sort한 이후의 결과로 정렬되어 나옴
		// 4
//		lu.arrayListAllPrint(list2);	
		
		list2.add("B");
		list2.add("C");
		list2.add(3, "A"); //(인덱스의 위치, "넣을 값")
		list2.add(1);
		
		// 5
//		lu.arrayListAllPrint(list2);	
		
//		list2.set(3, "AA");  		// set 으로 덮어 씌우기
		
		// 6
//		lu.arrayListAllPrint(list);		
		// 7
//		lu.arrayListAllPrint(list2);	
		
		// 안에 있는 모든 것을 0 으로 초기화한다
//		list.clear();
//		lu.arrayListAllPrint(list);
//		System.out.println(list.size());
		
		
		
		lu.arrayListAllPrint(list);  
		lu.arrayListAllPrint(list2);  
		
//		list2.remove(0);  // index 0위치의 값을 지워버린다 // 지워버리고 새로운 배열을 만드는 것 -한칸씩 앞으로 당겨준다
		
		System.out.println("==========================제거후");
//		lu.arrayListAllPrint(list);
//		lu.arrayListAllPrint(list2);
//		System.out.println(list2.size());
		
		
		System.out.println("=====list2를 list1과 중복되는 것을 제거하고 출력 결과에 A B C만 남겨라");
		
//		list2.remove(0);
//		list2.remove(0);
//		list2.remove(0);
	
		
		
		lu.arrayListAllPrint(list);
		lu.arrayListAllPrint(list2);
		System.out.println(list2.size());
		

		
		//		강인씨 코드(중첩for문) - index를 하나씩 일일히 접근하여 비교한것

//		for (int i = 0; i < list.size(); i++) {
//			      for (int j = 0; j < list2.size(); j++) {
//			         if(list.get(i) == list2.get(j)) {   // 같은 object끼리도 비교가 된다
//			            list2.remove(j);
//			         }
//			      }
//			   }
			      
		
//		System.out.println("여기야: " + list.get(0));   // 객체 그자체를 반환한다
		
		// 샘코드 - contains를 하면 리스트 전체를 찾는것??(검색에 대한 멋진 로직이 이미짜여있어서 속도가 엄청빠름)
//  왜 뒤에서 부터 지우나? stack의 유전자를 가지고 있으므로 FILO - LIFO
		
		//		for (int i = list2.size() - 1; i >= 0; i--) {
//			if (list.contains(list2.get(i))) {
//				list2.remove(i);			// 객체 그자체를 지운게 아니다
//			}
//		}
			    
		// 샘코드 -> 이건 왜 제대로 돌지않나? (자바의 정석 p587, 47일차 강의 필기)
//		만일 변수 i를 증가시켜가면서 삭제하면,
//		한요소가 삭제될때 마다 빈공간을 채우기 위해 나머지 요소들이 자리이동을 하기때문에
//		올바른 결과를 얻을수 없다
//		for (int i = 0; i < list2.size(); i++) {
//			if (list.contains(list2.get(i))) {
//				list2.remove(i);			// 객체 그자체를 지운게 아니다
//			}
//		}
		
		
		
		
		
		
		
		//왜 이건 안되지?
//		for (int i = list2.size() - 1; i >= 0; i--) {
//			if (list2.contains(list.get(i))) {
//				list2.remove(i);
//			}
//		}
		
			      lu.arrayListAllPrint(list);
			      lu.arrayListAllPrint(list2);	
	}

}
