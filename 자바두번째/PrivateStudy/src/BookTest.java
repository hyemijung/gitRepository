
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Book book = new Book();
		
		String title = "";
		String writer = "";
		String publisher = "";
		int price = 0;
		String publishingDate = "";

		// 수정한 코드(아래와 비교해라)
		
//		물건을 다만들고
		book.setTitle("자바의 정석");
		book.setWriter("남궁성");
		book.setPublisher("도우출판");
		book.setPrice(30000);
		book.setPublishingDate("2016년 1월 27일");
		
//		물건을 가져온다
//		인스턴스 변수를 활용하는 것과 안하는것의 차이점을 찾아라 -> 이후 가공에 용이(원래 것은 지키고)
//		-> 인스턴스 변수를 사용하지않고 바로 사용한다면? -> 속도는 빠르다
		title = book.getTitle();    // 인스턴스 변수 사용
		writer = book.getWriter();
		book.getPublisher();		// 인스턴스 변수 사용하지 않음
		book.getPrice();
		book.getPublishingDate();
		
//		물건의 정보를 출력한다
		System.out.println(book.getTitle());	// 인스턴스 변수 사용하지 않음
		System.out.println(title);				// 인스턴스 변수 사용
		System.out.println(book.getWriter());
		System.out.println(writer);
		System.out.println(book.getPublisher());
		System.out.println(book.getPrice());
		System.out.println(price + 10);  // 이런식의 활용가능
		System.out.println(book.getPublishingDate());

	
		
		
		
		
		// 위와 비교하라
		//		위와의 차이점 		
//		title = book.getTitle();
//		System.out.println(title)
		
		
	
		
		
//		book.setTitle("자바의 정석");
//		book.getTitle();
//		System.out.println(book.getTitle());
//				
//		
////		위와의 차이점 
//		title = book.getTitle();
//		System.out.println(title);
//		
//		book.setWriter("남궁성");
//		book.getWriter();
//		System.out.println(book.getWriter());
//				
//		book.setPublisher("도우출판");
//		book.getPublisher();
//		System.out.println(book.getPublisher());
//		
//		book.setPrice(30000);
//		book.getPrice();
//		System.out.println(book.getPrice());
//		
//		
//		book.setPublishingDate("2016년 1월 27일");
//		book.getPublishingDate();
//		System.out.println(book.getPublishingDate());
//		
	}

}
