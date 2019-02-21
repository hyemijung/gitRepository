package shoppoing.product;

import com.sun.java_cup.internal.runtime.Scanner;

public class Computer extends Product{
	
	
	
	public Computer(){		// 생성자
		
	}
	
	public Computer(String name){		// 생성자
		super(name);
	}
	
	public Computer(String name, int price) {
		super(name, price);
	}
	
	public void inputComPrice() {
		Scanner scan = new Scanner(System.in);
		int inputMoney = 0;
		System.out.println(name + "의 가격을 입력해주세요");
		 
	}
	
	public String myProductName() {
		return "Computer";
	}
	
	
//	public String toString() {
//		return "Computer";		
//	}
	
	
	
	
}
