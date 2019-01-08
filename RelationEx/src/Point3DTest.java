
public class Point3DTest {

	public static void main(String[] args) {
		
		Point3D p3 = new Point3D();
		String locationStr = "";
		
		p3.x = 1;
		p3.y = 2;
		p3.z = 3;
		
		locationStr = p3.getLocation();  // 부모의 것이 아닌 자기자신의 재정의된 메서드를 불러들이는 것
		
		System.out.println(locationStr);

		
		Point p = new Point();
		
		p.x = 10;
		p.y = 20;
		
		locationStr = p.getLocaton();
		System.out.println(locationStr);
		
	}
}
