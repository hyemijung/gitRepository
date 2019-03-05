import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx9 {

	public static void main(String[] args) {
		
//		[ Iterator ] 반복자
//
//		컬렉션에 저장된 요소들을 읽어오는 방법을 표준화 하였다.
		
//		Iterator 언제 쓴다?
//			출력할때
//
//		for문
//			변경할때
		
		
		// 명명규칙 : 의미있는 단어 + List(하여 목록임을 알려주도록 한다)
		List<Integer> numList = new ArrayList();
//		List<Integer> numList = new List();  // 이렇게 사용하면 안됨!! 뒤의 List()는 인터페이스이다
		
		
		// 설정(기능의 분리)
		for (int i = 0; i < 5; i++) {
			numList.add(i);
		}
		
		Iterator<Integer> it = numList.iterator();
		
		int cnt = 1;
		
		while (it.hasNext()){
			System.out.println("횟수: " + cnt);
			System.out.println(it.next()); // 만나는 순간 5개중 하나가 사라진 것 //iterator는 한번할때 한번씩만 호출한다!!!!
//			System.out.println(it.next()); // 만나는 순간 4개중 하나가 사라진 것// 이거있음 존재하지 않는 6번째것을 찾으므로 오류난다(두개씩 호출하지말라!!) -> for문써라
			cnt++;	
		}
		
		
		
	}
}
