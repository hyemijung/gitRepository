
public class Apple {
	
//	사과의 특징
	String color = "";
	String name = "";
	
	Apple(){
		
	}
	
	Apple(String name, String color){
		this.name = name;
		this.color = color;
	}
	
	void showAppleInfo() {
		System.out.println("사과의 색상은: " + color);
		System.out.println("사과의 이름은: " + name);
	}
	
	
}
