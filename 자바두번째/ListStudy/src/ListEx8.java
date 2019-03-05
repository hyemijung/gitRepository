import java.util.ArrayList;

public class ListEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		[ 제너릭스, 지네릭스(Generics) ]
//
//		다양한 타입의 객체들을 다루는 메서드나 컬렉션 클래스에 컴파일 시의 타입 체크를 해주는 기능이다.
//		객체의 타입을 컴파일 시에 체크하기 때문에 객체의 타입 안전성을 높이고 형변환의 번거로움을 줄여준다.
//
//		타입 안전성을 높인다는 것은 의도하지 않은 타입의 객체가 저장되는 것을 막고,
//		저장된 객체를 꺼내올 때 원래의 타입과 다른  타입으로 잘못 형변환되어 발생할 수 있는 오류를 줄여준다는 의미이다.
//
//		제너릭스의 장점 요약
//		1. 타입 안전성을 제공한다.
//		2. 타입체크와 형변환을 생략할 수 있으므로 코드가 간결해 진다.
		
		
//		ArrayList strList = new ArrayList();
		ArrayList<String> strList = new ArrayList<String>();  // 제너릭스를 적용한것 - 오직 문자열만 들어가는 것으로 정의함
		
		String str = "";
		
		str = "글자1";
		strList.add(str);
		str = "글자2";
		strList.add(str);
		str = "글자3";
		strList.add(str);
			
		int sum = 0;
		for (int i = 0; i < strList.size(); i++) {
//			str = (String)strList.get(i);   // 원래는 형변환하여 사용해야한다- get(i)는 오브젝트타입을 반환하므로
			str = strList.get(i);			// 제너릭스를 위에 적용했으므로 더이상 형변환 할 필요가 없다
			sum = sum + Integer.parseInt(strList.get(i));
			System.out.println(str);
		}
		
		System.out.println(sum);
		
//		strList.add(12);	// The method add(int, String) in the type ArrayList<String> is not applicable for the arguments (int)
		
		
		
	}

}
