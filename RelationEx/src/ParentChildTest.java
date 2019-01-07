
public class ParentChildTest {

	public static void main(String[] args) {
//		
//		Parent p = new Parent();
//		p.age = 47;
//		System.out.println(p.age);
//		
//		Child c = new Child();
//		c.age = 21; // 부모 자식간의 extends 상속을 통해서 정의하지않은 int age 변수를 사용할수 있는 것
//		System.out.println(c.age);
//		c.play();

		Child2 c2 = new Child2();
		// 부모꺼는 내꺼
		c2.age = 21;
		System.out.println(c2.age);
		// 내꺼는 내꺼
		c2.study();

		System.out.println();

		GrandChild grandC = new GrandChild();

		grandC.age = 1;               // 조상 Parent꺼 사용가능 // GrandChild의 나이가 1 라는 의미
		System.out.println(grandC.age); 
		grandC.play();                //부모 Child꺼 사용가능
		grandC.myIntroduce();        // 자기꺼 사용가능

		Parent p = new Parent();
		System.out.println("parent에서 만든 객체의 age 값은?");
		System.out.println(p.age);

	}
}
