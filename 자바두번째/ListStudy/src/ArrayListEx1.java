import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		[ List ] 
//
//				리스트는 1차원적인 구조로 데이터를 늘어놓은 형태의 자료구조이다.
//				배열과 흡사하지만 다른 점은 자료를 검색과 추가, 삭제가 아주 용이한다는 것이다
//
//				반면에 리스트처럼 1차원적인 구조로 되어있지만 
//				데이터의 추가와 삭제를 제한하여 일정한 규칙으로 추가/삭제를 해야하는 구조도 있다. 
//				바로 스택과 큐이다.
		
		
//		>>> object 를 매개변수로 받으면 어떤 클래스든 어떤 데이터든 받을수 있다
//		- 협업할때 무조건 object로 받으면 문제가 없음 
		
//		>> ArrayList는 (메서드를 통해 값을 다룬다)
//		add 를 통해 값을 넣는다
//		get 을 통해 값을 불러온다
		
//		>> 배열과 마찬가지로 반복문과 함께 힘을 발휘한다 
		
		ArrayList list = new ArrayList();
		
		list.add(new Integer(5));  
		list.add(new Integer(4));
		list.add(new Integer(2));
		list.add(new Integer(0));
		list.add(new Integer(1));
		list.add(new Integer(3));
		
		System.out.println(list.get(0));
		System.out.println(list.get(4));
		
		
		System.out.println("=========================================");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));			
		}
		
		
		
		
		
	}

}
