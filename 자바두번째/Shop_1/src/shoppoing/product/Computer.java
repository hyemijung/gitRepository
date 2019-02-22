package shoppoing.product;

public class Computer extends Product{
		
	private String plusKeyboard = "키보드 제공";
	
	public String toString() {
		String str = "";
		
		str += name + "\n";
		str += price + "\n";
		str += bonusPoint + "\n";
		str += plusKeyboard;
		
		return str;
	}

	

	
	
	
	
	
}
