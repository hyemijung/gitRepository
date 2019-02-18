package products.tv;

public class Tv {

		public String name = "";
		public int price = 0;

		public Tv() {
			
		}
		
		public Tv(String name, int price) {
			this.name = name;
			this.price = price;
		}
		
//		나의(tv의) 정보를 출력
		public void myInfoView() {
			System.out.println("tv명: " + name);
			System.out.println("tv가격: " + price);
			System.out.println();
		}
}
