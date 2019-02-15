package root.parent.child;

public class Child2 {
	
	String name = "";
	int age;
	
	
									
	public Child2(){        // 생성자안에 메서드도 불러올수있지만, 생성자안에서 다른 생성자도 불러올수있다
		// this(매개변수);  // 생성자를 불러오는 방법
//		this("자식2"); 		// 자기자신의 생성자(아래의것)를 불러온 것
//		name = "무조건 나";
//		name = "Child2(String name) 이후에 수행";
	}//기본생성자 안은 비워둬야 하는게 베스트
	
	public Child2(String name){		// 생성자이나 오버로딩 한것 // 다른패키지에서 사용하려면 앞에 public 붙여야한다
//		super();
//		this();
		this("ㄴㅇㄹ", 2134);
		this.name = name;		
	}
	
	public Child2(String name, int age){		
		super();    // 묵시적으로 사용되어진다 명시적으로하면 복잡해짐
		this.name = name;
//		this(name);        // this.name = name;	대신 적은것
		this.age = age;		
	}
//	메서드안에 메서드 호출하는 방식은 헷갈리므로 좋지않다(회사에선 피함)- 따로따로 완벽히 구분해서 호출한다
	
	
	public String nameView() {
		
		return name;
	}
//super();는 맨마지막에 수행될 생성자안에서 불러져야 한다.
}
