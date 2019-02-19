package project.test;

import project.car.Ambulance;
import project.car.Car;

public class CarTest2_1_2 {

	public static void main(String[] args) {

		Car car = null; 			// 부모참조변수 생성
		Ambulance ab = new Ambulance();
		Ambulance ab2 = null;
		
		System.out.println(ab);
//	앰뷸런스(물건)를 부모 참조(주소)변수에 넣어서 기능을 돌려본다	
//		!!!중요!!!! new 키워드가 없으면 주소를 만들수 없다 -> 이를 담을수 있는것을 참조변수라 한다
		System.out.println("앰뷸런스(물건)를 부모 참조(주소)변수에 넣어서 기능을 돌려본다");
		car = (Car)ab;   // 자식을 부모에 넣으려면, 묵시적 형변환이 되는데 명시적으로 적어줌
		car.drive();
		car.stop();
		
		System.out.println("car의 주소: " + car);
		
		System.out.println();
		System.out.println("==========================================");
//	부모의 인스턴스를 엠뷸런스 참조변수에 넣어서 기능을 돌려본다
		System.out.println("부모의 인스턴스를 엠뷸런스 참조변수에 넣어서 기능을 돌려본다");
		
		// 내가 처음에 부모의 인스턴스를 만들려고 했던 방식 // 이것은 그저 부모를 만든것(이게 필요한게 아님)
		Car car3 = new Car();
		System.out.println("부모를 만든 car3의 주소: " + car3); 
		
		System.out.println("==========================================");
		
		Car car2 = new Ambulance();   // 부모의 인스턴스라 했으므로 이렇게 인스턴스를 만들어야함(난 문제를 읽고 이를 만들지 못함!!!!) -> 테스트하다 오류남
		System.out.println("car2의 주소: " + car2);
		Ambulance ab3 = new Ambulance();
		System.out.println("ab3의 첫번째 주소: " + ab3);
		
		ab2 = (Ambulance)car;   	// new Car();로 부모를 만들었지 - ab2 즉, 자식은 만든적이 없으므로 오류다
		ab2.siren();
		ab2.drive();
		ab2.stop();
		
				
		ab3 = (Ambulance)car2;   	
//		ab3 = new Ambulance();   	// 위의 Ambulance ab3 = new Ambulance();와는 전혀다른 새로운 객체를 만든것(카누 2개로 예를 들었던거 기억해라!!)
		ab3.siren();
		ab3.drive();
		ab3.stop();
		
		((Ambulance)car).siren();  

		System.out.println("ab2의 주소: " + ab2);
		System.out.println("ab3의 두번째 주소: " + ab3);
	
		System.out.println("ab의 주소: " + ab);
		
		System.out.println("car2의 주소: " + car2);
	}

}