
public class Lotto {

	// 로또 번호 5개를 담을 배열 생성
	private int lottoNumArr[] = new int[5];
	

	// 로또 번호 5개 랜덤으로 생성하는 메서드 
	public void input() {
		for (int i = 0; i < lottoNumArr.length; i++) { // 5번 돌아 5개의 로또 번호 생성
			lottoNumArr[i] = (int) (Math.random() * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (lottoNumArr[i] == lottoNumArr[i]) { // 같은 로또 번호가 나온다
					i--; // i-- 해서 한번더 랜덤 번호로 번호를 생
				}
			}
		}

	}

	// 생성된 로또 번호 5개를 오름차순 정렬 메서드  
	public void sort() {
		int temp = 0;
		
		for (int i = 0; i < lottoNumArr.length; i++) {  // 5번 돌아갈때  
			for (int j = i+1; j < lottoNumArr.length+1; j++) {
				if (lottoNumArr[i] < lottoNumArr[j]) {
						temp = lottoNumArr[i];
						lottoNumArr[i] = lottoNumArr[j];
						lottoNumArr[j] = temp;
					
				}
			}
		}
		
	}
	
	// 오름차순 정렬된 로또 생성 번홀을 출력하는 메서드
	public void lottoPrint() {
		for (int i = 0; i < lottoNumArr.length; i++) {
			System.out.println(lottoNumArr[i]);
		}
	}
	
	
	
}
