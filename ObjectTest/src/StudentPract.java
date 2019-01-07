
public class StudentPract {

	String name = ""; // 클래스가 존재하는 한 사용가능
	int ban = 0;
	int no = 0;
	int kor = 0;
	int eng = 0;
	int math = 0;

	int getTotal() { // 매개변수 없으므로 ()안을 비워놔야한다
		int sum = 0; // 매개변수가 없다는 것은 지역변수만 쓸수 있다는 것
		sum = kor + eng + math;
		return sum;
	}

	double getAverage() {
//		국 + 영 + 수 = 총점
//		총점 / 과목수 = 평균
		double sum = 0;
		double average = 0;
		
		sum = kor + eng + math;   // 총점
		average = sum/3;          // 평균
		average = Math.round((sum/3) * 100);  //소수점 3째 자리까지 반올림(평균 * 100)  
		average = average / 100.0;  // 소수점 셋쨰자리에서 반올림 완성
	    
//		System.out.println(average);		
	    return average;
	}


}

