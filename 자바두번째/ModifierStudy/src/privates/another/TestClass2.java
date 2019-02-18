package privates.another;

import privates.test.PrivateTest;

public class TestClass2 extends PrivateTest{

	public	void testMethod() {
		super.num = 100;
		System.out.println(super.num);
		System.out.println(super.className);
	}
}
