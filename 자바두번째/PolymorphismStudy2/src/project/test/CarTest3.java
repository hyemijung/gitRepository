package project.test;

import project.car.Car;
import project.car.FireEngine;

public class CarTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FireEngine fe = new FireEngine();
		Car car = new Car();
		
		if (fe instanceof FireEngine) {
			System.out.println("이것은 FireEngine 객체다");
		}
		
		if (fe instanceof Car) {
			System.out.println("이것은 Car Instance다");
		}
		
		if (fe instanceof Object) {
			System.out.println("이것은 Object 객체다");
		}
		
//		if (fe instanceof Ambulance) {						//오류 Ambulance 와 FireEngine은 상속의 관계가 없기때문
//			System.out.println("이것은 Ambulance의 객체다");
//		}
		
		FireEngine fe2 = fe;
		Car c = fe;  // 자동 형변환
		Object o = fe;  // 자동 형변환
//		Ambulance al = (Ambulance)fe;  		//오류
		
		
//		 instanceof
//
//		 [ 표현식 ]
//		 검사하고 싶은 객체 instanceof 형변환이 가능한지 여부의 Class명
//
//		 어떤 타입에 대한 instanceof연산의 결과가
//		 true라는 것은 검사한 타입으로 형변환이 가능하다는 뜻이다
		
	}

}
