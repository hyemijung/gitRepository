public class ChildParentTest2 {
	public static void main(String[] args) {

	Parent2 p = new Child2();
	Child2 c = new Child2();
	
	
	
	Child2 cc = (Child2)p;  // 자식으로 형변환y
	System.out.println("cc주소" + cc); 
	System.out.println("cc.x = " + c);
	cc.showY();
	p = cc;   // 다시 부모로 형변환
	
	System.out.println("p.x = " + p.x);	
	p.method();
	System.out.println("c.x = " + c.x);	
	c.method();
	c.showX();  
	
	System.out.println(p);
	System.out.println(c);
	
		
	}
}

class Parent2 {
	int x = 1000;  //인스턴스 변수(재정의 되지않는다) // Parent만의 특징
	
	void method(){
		System.out.println("Parent Method");
	}
	
	void showX() {
		System.out.println(x);		
	}
}

class Child2 extends Parent2 {
	int x = 200;  //인스턴스 변수(재정의 되지않는다) // Child만의 특징
 
	void method(){
		System.out.println("Child Method"); 
	}
	
	void showY() {
		System.out.println("부모에 없는 버튼");
	}
}
