
public class ArrayEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		문자열 배열
		String[] nameArr = new String[3];
		
//		문자열은 규칙이 없으므로 일일히 입력을 해줘야한다 // 규칙이 없으며로 for문을 사용할수 없다
		nameArr[0] = "park";
		nameArr[1] = "seung";
		nameArr[2] = "wk";
		
		for (int i = 0; i < nameArr.length; i++) {
			System.out.println(nameArr[i]);
			
		}
	}
}
