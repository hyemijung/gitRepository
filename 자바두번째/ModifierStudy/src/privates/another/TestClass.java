package privates.another;

import privates.test.ProtectedTest;

public class TestClass extends ProtectedTest{

	public	void testMethod() {
		super.num = 100;  //명시적
		System.out.println(super.num);
		System.out.println(super.className);
	}
}
