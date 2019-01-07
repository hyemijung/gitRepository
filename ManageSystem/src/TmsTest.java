
public class TmsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "";
		int price = 0;
		String brand = "";

		Snack sn = new Snack();

		// 과자 정보 입력
		name = "바나나킥";
		price = 2000;
		brand = "농심";

		sn.inputSnack(name, price, brand);

		// 과자 정보 출력
		sn.printSnack();

		String cntName = "";
		int cnt = 0;

		Container ct = new Container();
		// 컨테이너 이름 입력
		cntName = "컨테이너 777";
		ct.info(cntName);
		// 재고 입력
		cnt = 7;
		ct.stack(cnt);
		// 재고 출력
		ct.containerP();

	}

}
