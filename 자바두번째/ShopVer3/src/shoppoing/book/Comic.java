package shoppoing.book;

public class Comic extends Book {

	public Comic(String name, int price) {
		super(name, price);
	}

	public String myProductName() {
		return "Comic";		
	}
}
