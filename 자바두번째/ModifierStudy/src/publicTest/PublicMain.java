package publicTest;

import publics.test.DefaultTest;
import publics.test.PublicTest;


public class PublicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PublicTest publicTest = new PublicTest();   //프로젝트나 일할땐 이렇게 정석으로 사용한다
		PublicTest pt = new PublicTest();      // 변수명을 앞글자만 따서 하기도하지만, 그래도 클래스명을 앞글자만 소문자로 바꾸고 그대로 사용
		DefaultTest defaultTest = new DefaultTest();
		
				
		publicTest.numPrint();
		publicTest.num = 234;
//		defaultTest.numPrint();    // publics라는 패키지를 벗어나 있으므로 접근이 불가하다
//		int num = defaultTest.num + 43;	// publics라는 패키지를 벗어나 있으므로 접근이 불가하다
		
		
		
		
	}

}
