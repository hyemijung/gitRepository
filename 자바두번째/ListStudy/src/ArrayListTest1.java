import java.util.ArrayList;

public class ArrayListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();

		list.add(1);
		list.add("정혜미");
		list.add(36);
//		void는 리턴값이 없으므로 add()안에 넣어서는 안된다 -> 최소 메서드 타입을 int나  string으로 하여 return 값이 있어야 한다
//		void 는 출력, 설정에 관련된것 이다.

		list.add(2);
		list.add("정민성");
		list.add(27);
 
		list.add(3);
		list.add("박대승"); 
		list.add(25);

		list.add(4);
		list.add("송지원");
		list.add(23);

		String teamNumber = "팀 번호: ";
		String teamName = "팀원 이름 : ";
		String teamAge = "팀원의 나이: ";

//		System.out.println(teamNumber+ list.get(0));
//		System.out.println(teamName + list.get(1));
//		System.out.println(teamAge + list.get(2));
//		System.out.println();
//		
//		System.out.println(teamNumber + list.get(3));
//		System.out.println(teamName + list.get(4));
//		System.out.println(teamAge + list.get(5));
//		System.out.println();
//		
//		System.out.println(teamNumber + list.get(6));
//		System.out.println(teamName + list.get(7));;
//		System.out.println(teamAge + list.get(8));
//		System.out.println();
//		
//		System.out.println(teamNumber + list.get(9));
//		System.out.println(teamName + list.get(10));
//		System.out.println(teamAge + list.get(11));

//		System.out.println("=======================================");

//		지원씨 코드
//		int count = 0; 											//(!!!!중요!!!!)인덱스의 위치를 지원해줄 변수를(전역변수로) for문 밖에 두는것이 포인트!!!
//		for (int i = 0; i < 4; i++) {
//			System.out.println(teamNumber + list.get(count));
//			count++;
//			System.out.println(teamName + list.get(count));
//			count++;
//			System.out.println(teamAge + list.get(count));
//			if (count < list.size()) {
//				count++;
//			}
//			System.out.println();
//		}

//		대승씨 코드, 혜선씨											
//		for (int i = 0; i < list.size(); i++) {					//list.size()를 이용했으므로 이후 매번 바꾸는 수고를 하지않아도 된다.		
//			System.out.println(teamNumber + list.get(i));		// i라는 인덱스를 다른곳에서 조작이 이루어지면, 몇번도는지 타인은 모를수도 있음	
//			i++;												// i를 건들이지 않아야 한다!!!!!!!!!!!!!!!(배열의 가능성을 닫아버린 것)
//			System.out.println(teamName + list.get(i));			
//			i++;
//			System.out.println(teamAge + list.get(i));
//			System.out.println();
//			
//		}

//		명선씨 코드
//		for (int i = 0; i < 4; i++) {								
//			System.out.println(teamNumber + list.get(i * 3));		// i를 건들지 않고 공식을 만들어, 그안에서 규칙을 찾았으므로 객체지향적인 코드이다
//			System.out.println(teamName + list.get(i * 3 + 1));
//			System.out.println(teamAge + list.get(i * 3 + 2));
//			System.out.println();
//		}

//		강인씨 코드 													//	정말 좋은 코드 
//	      for (int i = 0; i < list.size(); i++) {
//	          
//	          if(i % 3==0){
//	             System.out.println(teamNumber + list.get(i));
//	              System.out.println(teamName + list.get(i+1));
//	              System.out.println(teamAge + list.get(i+2));
//	              System.out.println(); 
//	          }
//	        
//	       }

//		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//			
//		}
//		
	}

}
