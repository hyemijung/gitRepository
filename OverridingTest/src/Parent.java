
public class Parent extends Object { // Parent는 보이지않지만 Object를 상속하고 있다

	int age = 20;
	
	void method() {
//		System.out.println("Parent메서드 호출");
//		System.out.println("age: " + age);
//		System.out.println("this.age: " + this.age);     // Child의 age가 출력
////		System.out.println("super.age: " + super.age);   // Parent의 age가 출력됨

//		System.out.println("부모의 나이: " + age);
		
		System.out.println("부모의 주소: " + this);
	
	
	}
	
	
	
}
