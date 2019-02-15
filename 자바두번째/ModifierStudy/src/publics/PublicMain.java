package publics;

import publics.test.DefaultTest;
import publics.test.PublicTest;

public class PublicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PublicTest publicTest = new PublicTest();   //프로젝트나 일할땐 이렇게 정석으로 사용한다
		PublicTest pt = new PublicTest();      // 변수명을 앞글자만 따서 하기도하지만, 그래도 클래스명을 앞글자만 소문자로 바꾸고 그대로 사용
		DefaultTest defaultTest = new DefaultTest();
		
				
		publicTest.numPrint();
		defaultTest.numPrint();  // defaultTest가 패키지가 다르므로 오류뜸
		
		
		
		
		
	}

}
