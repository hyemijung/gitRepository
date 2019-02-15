package points.figure;

public class Point3D extends Point {
	
	int z;
	
	Point3D(){      // 메인에서 기본생성자는 아직 사용하지않았기 때문에 앞에 public 을 쓰지 않아도 오류가 안뜨는 것이다
		
	}
	
	public Point3D(int x, int y, int z){
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public String getLocation() {
		return "x :" + x + ", y : " + y + ", z :" + z;
	}
	
	
}
