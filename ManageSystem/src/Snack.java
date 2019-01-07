
public class Snack {

	String name = "";
	int price = 0;
	String brand = "";

	void inputSnack(String name, int price, String brand) {
		this.name = name;
		this.price = price;
		this.brand = brand;
	}

	void printSnack() {
		System.out.println("name: " + name);
		System.out.println("price: " + price);
		System.out.println("brand: " + brand);
	}

}
