
public class Car2Test {

	public static void main(String[] args) {
		
		String color = "";
		String gearType = "";
		int door = 0;
		
		color = "red";
		gearType = "manual";
		door = 4;
		
		Car2 car1 = new Car2(color, gearType, door); //new 하기전 Car2(color, gearType, door)가 수행되고 new 수행됨
		
		car1.carInfo();
		
//		System.out.println(car1.color);
//		System.out.println(car1.gearType);
//		System.out.println(door);
		
	}
	
}
