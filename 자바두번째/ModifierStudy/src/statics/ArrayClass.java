package statics;

public class ArrayClass {

	// 잘모르겠음 내가 잘못만든듯
	int[] arrayTest = new int[100];
	int result = 0;
	
	int arrayMethod() {
		
		int result = 0;

		for (int i = 0; i < arrayTest.length; i++) {
			result = i + 1;
//			System.out.println(result);
		}
		return result;
	}

	
	// 출력하는 메서드를 만들지 않았었음 
//	위의 메서드만으로 메인에서 출력하려했기때문에, for문이 다돌고 마지막 값인 100만 출력되어 나왔던 것
	void arrayPrint() {
		for (int i = 0; i < arrayTest.length; i++) {
//			arrayTest[i] = i + 1;
			System.out.println(arrayTest[i]);
		}
		
	}

}
