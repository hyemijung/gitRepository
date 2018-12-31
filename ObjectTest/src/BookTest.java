
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 = new Book();
		Book book2 = new Book();
		
		
		book1.name = "자바의 정석";
		book1.price = 30000;
		
		System.out.println(book1.name +"은 " + book1.price + "원이다" );
		
		book2.name = "인생의 정석";
		book2.price = 70000;
		
		System.out.println(book2.name +"은 " + book2.price + "원이다" );
		
	}

}
