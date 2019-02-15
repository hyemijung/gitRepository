package root.parent.child;

public class Child1 {
	
	public String name = "";
	
	
									// 생성자는 클래스명과 똑같은 이름을 가진 메서드(리턴값이 필요없다)
	public Child1(){              // 생성자는 리턴타입이 없으므로 앞에  void 없어도
		name = "자식";	
	}
	
	public Child1(String name){		// 생성자이나 오버로딩 한것 // 다른패키지에서 사용하려면 앞에 public 붙여야한다
		this.name = name;		//
	}
	
	public String nameView() {
		
		return name;
	}
	
}
