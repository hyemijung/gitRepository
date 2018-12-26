
public class SwitchFlowEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		switch
//		표현식
//		switch (조건식) {
//		case 값1:
//				조건식의 결과가 값1과 같을 경우 수행될 문장들
//			break;
//		case 값2:
//				조건식의 결과가 값2과 같을 경우 수행될 문장들
//			break;
//		default:
//			조건식의 결과와 일치하는 case문이 없을 때 수행될 문장들
//			break;
//		}

//		break 없으면 그 이후의 것도 실행됨
		
		int score = 0;

		
		score = 200;
// 조건식은 true/false로 적어야되는데 왜 조건식에 score가? 값이 일치해야하는 switch문은 상수 기입 가능
		switch (score) {
		case 100:
			System.out.println("당신의 점수는 100이고 , 상품은 자전거입니다");
//			System.out.println("얼마든지 추가 가능");
			break;
		case 200:
			System.out.println("당신의 점수는 200이고 , 상품은 TV입니다");
			break;
		case 300:
			System.out.println("당신의 점수는 300이고 , 상품은 노트북입니다");
			break;
		default:
			System.out.println("죄송하지만 당신의 점수에 해당상품이 없습니다");
			break;
		}

	}

}
