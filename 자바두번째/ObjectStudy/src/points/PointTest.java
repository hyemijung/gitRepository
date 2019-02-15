package points;

import points.figure.Point3D;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String result = "";
		
		Point3D p3 = new Point3D(1,2,3);
		
		result = p3.getLocation();
		
		System.out.println(result);
		
		
	}

}
