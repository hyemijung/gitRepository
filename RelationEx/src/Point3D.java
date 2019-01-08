
public class Point3D extends Point{

	int z = 0;

	String getLocation() {

		return "x: " + x + ", y: " + y + ", z: " + z;  // 부모의 것을 오버라이딩을 통해 내것을 추가하여 같은 이름의 메서드를 재정의 할수있다
	}

}
