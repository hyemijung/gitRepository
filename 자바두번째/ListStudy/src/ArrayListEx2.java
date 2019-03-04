import java.util.ArrayList;

public class ArrayListEx2 {
	public static void main(String[] args) {


		ArrayList list = new ArrayList();
		
		list.add(new Integer(5));  
		list.add("글자도 당연되지");
		list.add(2);
		list.add(new Object());
		
		System.out.println(list.get(0));
		System.out.println(list.get(3));
//		System.out.println(list.get(4));   //하면 오류 - 위에서 arraylist 4개까지(index 3번)까지 만들었으므로
//   하지만 리스트는 동적으로 크기가 가변하므로 위에서 리스트를 더 생성할수 있다
//	낭비가 발생하지않고 미래에대한 예측을 할필요가없다(이전에는 배열크기를 정해야하는것과 다르다)
		
//		list.length 란 존재하지 않는다
//		list.size(); 를 사용하면 몇개이든 사용가능 하다
System.out.println("=========================================");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));			
		}
		
	}
}
 