package project.test;

import project.car.Car;
import project.car.FireEngine;

public class CarTest3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FireEngine fe = new FireEngine();
		Car car = new Car();
		
				
		// 물건(객체를 기준으로) instanceof 하는것
		
		if (car instanceof FireEngine) {  // Car(객체)를 기준으로 조사한것 FireEngine은 만든적도 없기때문에 오류!!
			System.out.println("이것은 FireEngine 객체다");
		}
		
		if (car instanceof Car) {
			System.out.println("이것은 Car Instance다");
		}
		
		if (car instanceof Object) {
			System.out.println("이것은 Object 객체다");
		}
		

		
	}

}
