
public class Container {

	String cont = "";
	int snackStack = 0;
	
	
	void info(String cont) {

		System.out.println("컨테이너의 이름은 " + cont + "입니다.");

	}

	int stack(int cnt) {

		snackStack = snackStack + cnt;

		return snackStack;

	}

	void containerP() {

		System.out.print("현재 컨테이너에 저장된 과자의 개수는 " + snackStack + "개 입니다.");

	}

}
