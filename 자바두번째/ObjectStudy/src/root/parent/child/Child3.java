package root.parent.child;

import root.parent.Parent1;

public class Child3 extends Parent1 {
	
	public String name = "";
				
	public Child3(){        
		super(); 	// 조상 클래스의 생성자(도 호출이 가능하다)
	}
	

	public String nameView() {
		
		return name;
	}
	
}
