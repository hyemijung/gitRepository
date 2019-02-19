package project.test;

import project.car.Car;
import project.car.FireEngine;

public class CarTest1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = null;
		FireEngine fe = new FireEngine();  // 객체(물건)은 한번만 만든 것
		FireEngine fe2 = null;

		fe.door = 2;
		System.out.println("fe.door : " + fe.door);
		
		car = fe;   // 변수의 = 하는 것과, 객체의 = 하는 것은 다르다(주소가 복사된다)
		System.out.println("car.door : " + car.door);
		
		car.door = 4;
		fe2 = (FireEngine)car;
		System.out.println("fe2.door : " + fe2.door);
		
		System.out.println("한바퀴 돌고 온 fe.door : " + fe.door);
		
		System.out.println(car);
		System.out.println(fe);
		System.out.println(fe2);
		
	}
}