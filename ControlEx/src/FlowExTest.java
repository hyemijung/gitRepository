

public class FlowExTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 내가 푼 방식
//		int visit = 0;
//	
//		visit = 2;
//		
//		
//		if(visit ==1) {
//			System.out.println("처음 오셨군요 방문해주셔서 감사합니다");
//			System.out.println("방문횟수는 1번 입니다");
//		} 
//		
//		if(visit >1) {
//			System.out.println("다시 방문해 주셔서 감사합니다");
//			System.out.println("방문횟수는 2번 입니다");
//		}
		
		
		
		int visitCount = 0;
		
		visitCount = 3;
			
			System.out.println("몇 번 방문하셨나요?");
			
			if(visitCount == 0) {
				System.out.println("처음 오셨군요 방문해주셔서 감사합니다");
//				System.out.println("방문횟수는 " + (visitCount+1) +" 번 입니다");
			} 
			
			if(visitCount > 0) {
				System.out.println("다시 방문해 주셔서 감사합니다");
//				System.out.println("방문횟수는 " + (visitCount+1) + "번 입니다");
//				System.out.println("방문횟수는 " + ++visitCount + "번 입니다"); 유지보수에 안좋음
			}
			
			System.out.println("방문횟수는 " + (visitCount+1) +" 번 입니다");
//			코드 중복 제거(코드가 같은것이 중복된다면 진행과정상 그다음 코드가 진행되므로 코드를 뒤로 빼서 한번에 처리되도록한다)
			
			
			
	}

}
