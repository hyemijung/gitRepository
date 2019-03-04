import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 배열의 어려움을 list와 비교하여 알아본다
		
		
//	   list를 사용하지않고 출력결과가 동일하도록 앞에 0을 추가하여라
//	   배열 복제가 필요하다

		int[] numArr = new int[5];

// 내가 시도한 방법(틀림)	   
//	   int[] numArr2 = new int[6];
//	   
//	   for (int i = 0; i < numArr.length+; i++) {
//		numArr2[i] = numArr[i+1]; 
//	} 

		for (int i = 0; i < 5; i++) {
			numArr[i] = i + 1;
		} 

		for (int i = 0; i < 5; i++) {
			System.out.print(numArr[i] + "\t");
		}

		System.out.println();

// 혜선씨 코드
		System.out.println("앞에 0 추가 후");
		int tmpArr[] = new int[numArr.length + 1];

		tmpArr[0] = 0;

		for (int i = 0; i < numArr.length; i++) {
			tmpArr[i + 1] = numArr[i];
		}

		for (int i = 0; i < tmpArr.length; i++) {
			System.out.print(tmpArr[i] + "\t");
		}

		System.out.println();

		
		
		
		//	 2번   - 배열 끝에 0 을 추가해라
		System.out.println("뒤에 0 추가 후");
		int tmpArr2[] = new int[numArr.length + 1];
		
		for (int i = 0; i < numArr.length; i++) {
			tmpArr2[i] = numArr[i];
		}

//		tmpArr2[5] = 0;
		tmpArr2[tmpArr.length-1] = 0;

		for (int i = 0; i < tmpArr.length; i++) {
			System.out.print(tmpArr2[i] + "\t");
		}

		System.out.println();

		
		
		
//		3번 중간에 0 을 넣는다 (인덱스 2번에 0 삽입) // 명선씨가 알려줌
		
		System.out.println("중간에 0 추가 후");
		int tmpArr3[] = new int[numArr.length + 1 ];
			
		for (int i = 0; i < 2 ; i++) {
			tmpArr3[i] = numArr[i];
			System.out.println("첫번째 자른 배열: " + tmpArr3[i]);
		}

		for (int i = 3; i < tmpArr.length; i++) {
			tmpArr3[i] = numArr[i-1];  
			System.out.println("두번째 자른 배열: " + tmpArr3[i]);
		}
		
				
		tmpArr3[2] = 0;
		
				
		for (int i = 0; i < tmpArr.length; i++) {
			System.out.print(tmpArr3[i] + "\t");
		}
		
		
		
		
		
		
		
		
//      ArrayList list = new ArrayList();
//      
//      for (int i = 0; i < 5; i++) {
//         list.add(i+1);
//      }
//
//      for (int i = 0; i < list.size(); i++) {
//         System.out.print(list.get(i) + "\t");
//      }
//      System.out.println();
//      
//      1번
//      list.add(0, 0);
//      2번
//	    list.add(list.size(), 0);
//		3번
//		list.add(2, 0);

//      System.out.println("추가후");
//      for (int i = 0; i < list.size(); i++) {
//         System.out.print(list.get(i) + "\t");
//      }
//      System.out.println();

	}

}