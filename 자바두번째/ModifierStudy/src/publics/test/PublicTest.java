package publics.test;

public class PublicTest {
	
//	default int num = 0;   // 이런건 오류다 기본적으로 default 가 들어가 있음으로
	
	public int num = 0;
	
	public void numPrint() {
		PublicTest pt = new PublicTest();  // 같은 패키지내이므로 
		DefaultTest dt = new DefaultTest();  // 같은 패키지내이므로 
		
		
		
		System.out.println("num의 값은 " + num);
	}


}
