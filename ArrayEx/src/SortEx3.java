
public class SortEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		강사님것 다운받아 총 면번 돌았는지 횟수체크하는 코드랑 비교 (cnt 들어간 것)
		int[] scoreArr = new int[5];

		scoreArr[0] = 15;
		scoreArr[1] = 11;
		scoreArr[2] = 1;
		scoreArr[3] = 3;
		scoreArr[4] = 8;

		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print(scoreArr[i] + " ");
		}

		System.out.println();
		System.out.println("오름차순으로 정렬");

		int temp = 0;
		boolean check = false; // 자리바꿈이 발생했는지 체크

		for (int i = 0; i < scoreArr.length - 1; i++) { // length-1 하면 이미 정렬된것들// 여기부터 SortEx2과 비교하여 바꿔진 부분(아래)
			check = false; //

			for (int n = 0; n < scoreArr.length - 1 - i; n++) { // -i 이유? 뒤는 정렬되어 있으므로
				if (scoreArr[n] > scoreArr[n + 1]) { // 서로 인접한것 끼리 비교 , n과 n+1 // 옆의 값이 작으면 서로 바꾼다
					temp = scoreArr[n];
					scoreArr[n] = scoreArr[n + 1];
					scoreArr[n + 1] = temp;
					check = true; // 서로 변경되었으니 자기가 변경되었음을 설정
				}

			}
			if (check == false) { // 최선과 최악을 체크할수있는 //변경여부 체크 // 자리바꿈이 없으면 반복문을 벗어난다
				break;
			}
		}
//		정렬된 결과를 출력
		for (int i = 0; i < scoreArr.length; i++) {
			System.out.print(scoreArr[i] + " ");
		}
	}

}
