
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human ha1 = new Human();
		
		ha1.name = "이상한 사람";
		ha1.age = 1;
		ha1.appleColor = "빨간색";  // 사람에 대해서 건드는거지 사과를 건드는게 아님
		ha1.appleName = "사과";
		
			
		
		Human2 h1 = new Human2();
		
		h1.name = "일반사람";
		h1.age = 2;
//		h1.apple = new Apple(); // 사람은 사과를 가지고 있다(사과를 가지는순간 사과에 관련된 모든것을 쓸수있다) 
		Apple apple = new Apple();						
		apple.color = "초록색";
		
//		h1.apple.name = "나만의 특별한 사과"; // 내가 가진 사과니깐, 사과의 이름을 바꿈 
		
		h1.apple = apple;  //사람을 주체로(사과를 가지니깐 -인스턴스변수에 적으면됨), 사과를 마음대로 
		
		h1.apple.showAppleInfo();
		
		
//		System.out.println(h1.apple.name);
//		System.out.println(h1.apple.color);
		
		Human2 h2 = new Human2();
		
		h2.apple = new Apple("거창사과", "새빨간색");
		
		h2.apple.showAppleInfo();
		
		
		
		
				
				
				
	}

}
