

public class TimeTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Time t = new Time();
		int hour = 0;
		int minute = 0;
		int second = 0;
		
//		t.hour = 12; //직접적으로 인스턴스변수에 접근하면
//		t.minute = -1; //이런식으로 접근하는 것은 보안이 다 뚫린다. 쓸데없는 데이터도 다 넣을수있음 (이렇게 사용안함.)
//		그러므로 인스턴스 변수 갯수만큼 메서드(함수)가 필요하다
//		-> 메서드를 통해 접근하여 유효성 체크를 한다(보안과 쓸모있는 데이터만 들어가도록)		
//-> 아예 인스턴스 변수로의 접근을 막아야한다!!!!!! -> 접근제어자!!!
		
		
		
		t.setHour(22);
		hour = t.getHour();
		System.out.println("시: " + hour); // 값을 불러오기위해(직접적 접근 불가능하니깐, 메서드로 접근)
//		System.out.println(t.hour); // 직접 접근
		
		t.setMinute(57);   // 설정
		minute = t.getMinute();   //출력   
		System.out.println("분: " + minute);
		
		t.setSecond(25);
		second = t.getSecond();
		System.out.println("초: " + second);
		
		
		
		
		
//		 private접근 제어자를 통해 인스턴스 변수로의 접근을 방해했으므로 아래 출력들 오류		
				
//		t.setHour(25);
//		System.out.println(t.hour);
//		t.setHour(-25);
//		System.out.println(t.hour);
//		
//		
//		System.out.println("+================================+");
//		
//		t.setMinute(61);
//		System.out.println(t.minute);
//		t.setMinute(-1);
//		System.out.println(t.minute);
//		t.setMinute(52);
//		System.out.println(t.minute);
		
		
		
		}

	}

