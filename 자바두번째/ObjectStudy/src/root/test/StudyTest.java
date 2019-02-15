package root.test;

import root.parent.child.Child1;    // import 안하면 같은 패키지안이 아니므로 아래를 사용할수 없다

public class StudyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String resultStr = "";
		
		Child1 c1 = new Child1();
		Child1 c2 = new Child1();  // 생성자 Child1(String name)에 public이 안붙어 있으므로 안됨
		Child1 c3 = new Child1("내가 만든 자식");  // 생성자 Child1(String name)에 public이 안붙어 있으므로 안됨
		
		resultStr = c1.nameView();
		c1.name = "이젠되나";    // Child1클래스의 인스턴스변수 String name 앞에 public이 붙어있으므로 여기서 사용가능
		
		
		System.out.println(c1.name);
		
		System.out.println(resultStr); 		// 활용이가능한 변수에 담아서 출력하느냐
		System.out.println(c2.nameView()); // 변수에 담지않고 바로 출력하느냐
		
		resultStr = c3.nameView();
		
		System.out.println(resultStr);
		
	}

}
