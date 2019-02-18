package privates.test;

public class PrivateTest {

	private int num;
	private String str;
	private String className = "PrivateTest";
	
	private void instancePrint() {
		System.out.println(num);
		System.out.println(str);
		System.out.println(className);
	}
	
}
