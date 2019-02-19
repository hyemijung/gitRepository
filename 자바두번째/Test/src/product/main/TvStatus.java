package product.main;

import product.RecTv;
import product.Tv;

public class TvStatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv tv = new Tv();
		tv.tvInfoView();
		tv.tvInfoPrint();
		
		System.out.println();
		
		RecTv rTv = new RecTv();
//		rTv.recTvInfoView();       // 자식의 메서드를 별도로 만들어서 한것
//		rTv.recTvInfoPrint();
		rTv.tvInfoView();		// 상속받아 부모의 메서드를 오버라이딩 한것
		rTv.tvInfoPrint();
		
		
		
		
	}

}
