package finals;

public class FinalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 나혼자 못함
		
		
		int maxSize = 0;
		
		FinalTest ft = new FinalTest();
		
		maxSize = ft.getMaxSize();
		
//		maxSize = FinalTest.getMaxSize();  // 이렇게 하면 왜 안되는가?
		
		System.out.println("ft에서 호출한거야: " + maxSize);
		
		System.out.println(ft.MAX_SIZE + 1);
		
		ChildClass childClass = new ChildClass();
		maxSize = childClass.getMaxSize();
		
		System.out.println("이건 ChildClass를 호출한거야: " + maxSize);
	}

}
