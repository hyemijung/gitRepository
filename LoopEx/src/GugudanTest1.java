
public class GugudanTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 2; i <= 9; i++) {
			System.out.println();
			System.out.println( i + " 단");
			
			for (int n = 1; n <= 9; n++) {
				System.out.println(i + " * " + n + " = " + (i * n));
			}

		}

	}
}
// 내가 처음 틀린이유 {} 블럭밖을 벗어나 중첩 for문을 작성해서 에러가남
// 각 단의 이름이 들어가는 위치는 중첩되는 안의 for문이 끝나고 최초의 for문이 시작될때 나오면 된다
//각단위에 빈줄넣어준다 
