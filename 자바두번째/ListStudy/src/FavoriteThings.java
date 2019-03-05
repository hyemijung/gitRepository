import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FavoriteThings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 명선씨 코드 오오오오오~~~~ 
		// 취미
		Scanner scan = new Scanner(System.in);
	      ArrayList<String> favorite = new ArrayList();
	      String favoriteThings = "";
	      String answer = "네";

	      while (answer.equals("네")) {
	         System.out.println("당신의 취미를 입력해 주세요");
	         favoriteThings = scan.nextLine();
	         System.out.println("추가로 입력하시겠습니까?");
	         System.out.println("맞으면  '네' 를, 더 입력하시려면 '아니오' 를 입력해 주세요");
	         answer = scan.nextLine();
	         if (answer.equals("네")) {
	            favorite.add(favoriteThings);
	         }else if(answer.equals("아니오")) {
	         favorite.add(favoriteThings);
	         }
	      }
	      System.out.println("입력을 종료합니다");

	      Iterator <String>favIt = favorite.iterator();
	      while (favIt.hasNext()) {
//	         favIt.next();
	         System.out.println(favIt.next());
	      }

		
	}

}
