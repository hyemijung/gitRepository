
public class Book {

	private String title;
	private String writer;
	private String publisher;
	private int price;
	private int publishingDate;
	
//	title
	void setTitle(String title) {
		this.title = title;
	}
	
	String getTitle() {
		return title;
	}
	
//	writer
	void setWriter(String writer) {
		this.writer = writer;
	}
	
	String getWriter() {
		return writer;
	}
	
//	publisher
	void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	String getPublisher() {
		return publisher;
	}
	
//	price
	void setPrice(int price) {
		this.price = price;
	}
	
	int getPrice() {
		return price;
	}
	
//	publishingDate
	void setPublishingDate(int publishingDate) {
		this.publishingDate = publishingDate;
	}
	
	int getPublishingDate() {
		return publishingDate;
	}
	
	
//	모두가 아는 명명규칙이 아님  (인스턴스 변수 안에 있는 순수한 내용을 가져올때 이렇게 하면 명명규칙때문에 다른 사람들과 소통이 잘안된다)
//	-> 이런식으로 한다면 순수한 내용을 가져오는것이 아니라 뭔가 가공처리한후 가져온다면 이렇게 사용해도 좋다
	public void bookPrint() {
		
		System.out.println(title);				
		System.out.println(writer);
		System.out.println(price); 
		System.out.println(publisher);
		System.out.println(publishingDate);
	}
	
	
	
//	object 메서드 오버라이딩(인스턴스변수 안에 있는 순수한 내용을 가져올때 toString()사용한다 - 모두가 아는 명명규칙, 다른사람과 소통가능)
	public String toString() {
		String str = "";
		
		str += title + "\n"; 
		str += writer + "\n"; 
		str += price + "\n"; 
		str += publisher + "\n"; 
		str += publishingDate + "\n"; 
				
		return str;
				
	}
	
	
}
