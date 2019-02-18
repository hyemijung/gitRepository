package exam.test;

public class Tv extends Product{

	String productName = "GoZiller";
	int price = 500; 
	
	Tv(){
		this(100);
	}
	
	Tv(int price){ //
		super();
		this.price = price;   // 
	}
	
	Tv(int price, int bonusPoint){ 
		super();
		this.price = price; //
		this.bonusPoint = 200;//
		this.productName = productName; //  
	}
	
	int getBonusPoint() {
		
		return bonusPoint;
	}
	
	String getName() {
		return productName;
	}
	
	void totalInfo() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(bonusPoint);
		System.out.println(productName);
	}
	
}
