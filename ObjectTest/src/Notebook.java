
public class Notebook {

//	static String manufacturer = ""; // static을 붙여 항상 이값을 쓸것임을 알림
	String manufacturer = "";
	int price = 0;
	int hardDisk = 0;
	int ram = 0;

	Notebook(){
		
	}
	
	Notebook(String manufacturer, int price, int hardDisk, int ram) {
		this.manufacturer = manufacturer;
		this.price = price;
		this.hardDisk = hardDisk;
		this.ram = ram;

	}

	void info() {
//		System.out.println("제조사 " + Notebook.manufacturer);    // 클래스명을 앞에 붙여주면서 클래스 변수임을 알려준다
		System.out.println("제조사 " + manufacturer);
		System.out.println("가격 " + price);
		System.out.println("용량 " + hardDisk + "GB");
		System.out.println("메모리 " + ram + "G");
		System.out.println();
	}

}
