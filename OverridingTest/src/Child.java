//super

//조상 멤버와 자신의 멤버를 구별하는데 사용된다는 점을 제외하고는
//super와 this는 근본적으로 같다
//모든 인스턴스메서드에는 자신이 속한 인스턴스의 주소가 지역변수로 저장되는데
//이것이 참조변수인 this와 super의 값이 된다

//static 메서드는 인스턴스와 관련이 없다
//this와 super로는 static메서드를 사용할 수 없다

//자신의 멤버변수와 조상의 멤버변수를 구분해서 부를 때 사용한다 (this와 super)
//조상을 호출할 땐 super를 사용하자

public class Child extends Parent {

	int age = 7; // 부모의 것을 상속받는데 똑같은 인스턴스 변수를 자녀에서 만들면?
	String name = "";

	void method() {
//		System.out.println("Child메서드 호출");
//		System.out.println("age: " + age);
//		System.out.println("this.age: " + this.age);     // Child의 age가 출력
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println("super.age: " + super.age);   // Parent의 age가 출력됨

		super.method();
//		System.out.println("자식의 나이: " + age);
		System.out.println("자식의 주소: " + this);
//		System.out.println("child에서 수행한 super주소: ");
	}

}
