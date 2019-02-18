package privates.another;

import privates.test.ProtectedTest;

public class TestClass3 {

	public	void testMethod() {
		ProtectedTest pt = new ProtectedTest();
		super.num = 100;
		System.out.println(super.num);
		System.out.println(super.className);
	}
}
