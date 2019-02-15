package exam.test;


public class ConstructorTest2 {
	public static void main(String[] args) {
		Child c = new Child();

		Parent p = new Parent();
		
		System.out.println("x=" + c.getX());
		System.out.println("parent" + p.getX());
	}
}