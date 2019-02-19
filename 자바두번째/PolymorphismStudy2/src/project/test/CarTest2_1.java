package project.test;

import project.car.Ambulance;
import project.car.Car;

public class CarTest2_1 {

	public static void main(String[] args) {

		Car car = null; 			// 부모참조변수 생성
		Ambulance ab = new Ambulance();
		Ambulance ab2 = null;
		

//	앰뷸런스(물건)를 부모 참조(주소)변수에 넣어서 기능을 돌려본다	
//		!!!중요!!!! new 키워드가 없으면 주소를 만들수 없다 -> 이를 담을수 있는것을 참조변수라 한다
		

		System.out.println("앰뷸런스(물건)를 부모 참조(주소)변수에 넣어서 기능을 돌려본다");
		car = (Car)ab;   // 자식을 부모에 넣으려면, 묵시적 형변환이 되는데 명시적으로 적어줌
		car.drive();
		car.stop();
		
		System.out.println("car의 주소: " + car);
		
//		ab.siren();
//		ab.drive();
//		ab.stop();
		
		
		System.out.println();
		
//	부모의 인스턴스를 엠뷸런스 참조변수에 넣어서 기능을 돌려본다
		System.out.println("부모의 인스턴스를 엠뷸런스 참조변수에 넣어서 기능을 돌려본다");
		
//		Car car2 = new Car();   // 부모의 인스턴스라 했으므로 이렇게 인스턴스를 만들어야함(난 문제를 읽고 이를 만들지 못함!!!!) -> 테스트하다 오류남 -> CarTest3에서 한다
		
		ab2 = (Ambulance)car;    // 부모를 자식에 넣으려면, 명시적 형변환이 필요하다!!!!!
		ab2.siren();
		ab2.drive();
		ab2.stop();
		
		((Ambulance)car).siren();  

		System.out.println("ab2의 주소: " + ab2);
	
		System.out.println("ab의 주소: " + ab);
	}

}