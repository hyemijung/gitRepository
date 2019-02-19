package project.test;

import project.car.Car;
import project.car.FireEngine;

public class CarTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = (Car)fe;				//자식은 부모에게 들어갈수 있다 (자동 형변환)
		
//		fe = car;				// 부모는 자식에게 들어갈수 없다(자식이 기능이 더많음)
//		car.water();			//오류: car에는 water()기능 없으므로
		
		
		
//		다형성
//		참조변수의 형변환 
		fe2 = (FireEngine)car;  //형변환을 통해 부모도 자식에게 들어갈수있다 (참조변수의 명시적 형변환)//car를 FireEngine 타입으로 바꿔서 넣었다
		fe2.water();
		
		int num = 4;
		byte b = 0;
//		b = num;    // 형변환(int는 크고 byte는 작고 - 작은그릇에 큰것을 담으려는 것)
		b = (byte)num;  // 기본형 형변환 한것 (큰것에서 작은것으로 형변환 할때는 데이터 손실 일어나므로 명시적으로 형변환 해줘야!!!)
						// (작은것에서 큰것으로 형변환 할때는 묵시적 형변환이 가능)
		
//		다형성
//		[ 참조변수의 형변환 ]
//
//		기본형 변수와 같이 참조변수도 형변환이 가능하다
//		단, 서로 상속관계에 있는 클래스 사이에서만 가능하기 때문에 자손타입의 참조변수를 조상타입의 참조변수로,
//		조상타입의 참조변수를 자손타입의 참조변수로 형변환이 가능하다
//
//		자손타입 -> 조상타입(Up Casting) : 형변환 생략가능
//
//		자손타입 <- 조상타입(down Casting) : 형변환 생략불가
		
	}

}
