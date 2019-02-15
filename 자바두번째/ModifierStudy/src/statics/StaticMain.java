package statics;

public class StaticMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		StaticTest st = new StaticTest();  // 이제 이런식으로 상용하지않음
		int resultNum = 0;
		
		resultNum = StaticTest.max(100, 20);
		
//		System.out.println(resultNum);
		
		StaticTest st = new StaticTest();
		
		StaticTest st2 = new StaticTest();
		
//		st.height = 234;
		
		System.out.println(st.height);  
		System.out.println(st2.height);       // 더이상 이렇게 불러선 안된다
		System.out.println(StaticTest.height);  // 이 방식으로 불러야함
	
	
	}

}
