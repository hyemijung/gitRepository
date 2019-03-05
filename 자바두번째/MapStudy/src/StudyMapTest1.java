import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class StudyMapTest1 {

	public static void main(String[] args) {
		
		// 이것은 Map
		HashMap<String, String> userMap = new HashMap();
		
		// 순서 없음, 키는 중복 X , 밸류는 중복 O
		// 키와 밸류
		// put 으로 입력 , get 으로 밸류값을 가져온다
		userMap.put("myId", "1234");
		userMap.put("asdf", "1111");
		userMap.put("asdf", "1234"); // 위의 밸류값을 덮어 씌운 것  // 주석처리해서 확인해봐라
		
		System.out.println(userMap.get("myId"));
		System.out.println(userMap.get("asdf"));
		System.out.println(userMap.get("asdf2"));  // 없는 키에 접근했으므로 결과 값이 null 이라고 나온다
		
		
		
		// 이것은 List
		List<String> strList = new ArrayList();
				
		strList.add("asdf");
		strList.add("asdf");

//		System.out.println(strList.get(0));
//		System.out.println(strList.get(1));
		
		
		// containsKey 사용말라 -> 그럼 어떻게?
		// 아래를 스캐너로 받는다
		String userIdInput = "myId";  // 스캐너로 이걸 받는다
		String userPwdInput = "1234";
		
		// 해쉬맵은 순서따위가 없으므로, 중간에 있는것을 찾아도 아주 빠르게 찾을수 있다
		// 아래의 것은 기능의 분리가 되어있지않음 
		if (userMap.get(userIdInput).equals(userPwdInput)) { // equals 는 가볍다 -> 효율적!!!
			System.out.println("비밀번호가 일치합니다");
		}
		
		
				
		
		//ContainsKey는 회사에서 사용하지 않는다!! -> 사용하면  키값만큼 찾을때까지 돌아가는것 -> 비효율!!!
				
//		  Scanner scan = new Scanner(System.in);
//	      
//	      String id = "";
//	      String password = "";
//	      while(true) {
//	         System.out.println("id와 password를 입력해주세요");
//	         System.out.print("id: ");
//	         
//	         id = scan.nextLine().trim();
//	         
//	         System.out.print("password: ");
//	         password = scan.nextLine().trim();
//	         System.out.println();
//
//	         // 사용자 정보에서 id가 존재하지 않으면
//	         if(!userMap.containsKey(id)) { //if(!userMap.containsKey(id) == false) 라고 해야함, 하지만 저 뜻이 이미 이뜻을 포함하고 있음
//	            System.out.println("입력하신 id는 존재하지 않습니다.");
//	            System.out.println("다시 입력해주세요");
//	            
//	            continue; // continue문을 만나면 이 다음이 수행되는 것이아니라 최상위로 올라가 다시 수행된다//되도록 사용하지않는것이 권고사항
//	         }else {
//	            if(!(userMap.get(id)).equals(password)) {  //get(id)해서 아이디를 통해찾은 밸류값이 오는것
//	               System.out.println("비밀번호가 일치하지 않습니다.");
//	               System.out.println("다시 입력해주세요");
//	            }else {
//	               System.out.println("id와 비밀번호가 일치합니다.");
//	               System.out.println("아이디: " + id);
//	               System.out.println("비번: " + userMap.get(id));
//	               break;
//	            }
//	         }
//	         
//	      }
//	      
//	      System.out.println("로그인 되셨습니다");
//		
		
		
	}
	
}
