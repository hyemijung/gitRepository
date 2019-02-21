
public class Time {

	private int hour;     //인스턴스 변수로의 접근을 접근제어자를 통해 막음
	private int minute;
	private int second;
	
	
// private을 통해 인스턴스변수로의 직접적 접근을 막고,
//	메서드엔 public을 통해 매개변수로의 접근을 받아, 인스턴스 변수의 값을 가져온다
// 캡슐화의 시작!!!

	//	시 0~23
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) {  // 함수안의 if문은 큰일을 한다 (validation)
			return;  // return문 덕분에 이조건을 충족하지않으면 그다음 수행되지 않는다
		}
		
		this.hour = hour;
	}
		
	public int getHour() {
		return hour;
	}
	
//	분 0~59
	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) {
			return;
		}
		this.minute = minute;
	}
	
	public int getMinute() {
		return minute;
	}
		
//	초 0~59
	public void setSecond(int second) {
		if (second < 0 || second > 59) {
			return;
		}
		this.second = second;
	}
	
	public int getSecond() {
		return second;
	}
	
	
}
