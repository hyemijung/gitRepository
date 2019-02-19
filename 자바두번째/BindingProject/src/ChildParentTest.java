public class ChildParentTest {
	public static void main(String[] args) {

	Parent p = new Child();
	Child c = new Child();
	
	System.out.println("p.x = " + p.x);	
	p.method();
	System.out.println("c.x = " + c.x);	
	c.method();
	
	System.out.println(p);
	System.out.println(c);
	
		
	}
}

class Parent {
	int x = 1000;
	
	void method(){
		System.out.println("Parent Method");
	}
}

class Child extends Parent {
	int x = 200;

//	부모의 메서드를 오버라이딩(수정,추가) - 오버라이딩 했다는건 무언가 기능이 더 필요해서 한것이다
//	이렇게 해야만 이후에 보안을 위해,
//	->부모클래스의 정보를 숨길것은 숨기고 자식클래스의 보여줄것은 보여주는 것이 가능해 진다
	void method(){
		System.out.println("Child Method"); 
	}
}
