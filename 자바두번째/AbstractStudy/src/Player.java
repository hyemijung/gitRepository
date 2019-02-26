
abstract class Player {
	
//	The type Player must be an abstract class to define abstract methods
//	abstract라는 메서드가 하나라도 존재하는 순간, 클래스에 무조건 abstract를 붙여라(미구현된 클래스니깐)
	
//	왜 미구현 상태로 만들었을까?
//	팀장님이나 상사가 뼈대를 추상클래스로 만들어주면, 추상클래스는 무조건 상속을 사용하므로 상속받은 자식 클래스는 신입이 자유롭게 작성가능
//	자식클래스내 로직은 마음대로 작성가능 (다형성의 모호함도 사라짐)
	
	private int pos = 0;
	private int lastPos = 0;
	private String name = "";
	
//	source -> Generate getters and setters 하면 자동생성됨
	public int getPos() {
		return pos;
	}
	public void setPos(int pos) {
		this.pos = pos;
	}
	public int getLastPos() {
		return lastPos;
	}
	public void setLastPos(int lastPos) {
		this.lastPos = lastPos;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
//	source -> Generate toString 하면 자동생성됨
	@Override
	public String toString() {
		return "Player [pos=" + pos + ", lastPos=" + lastPos + ", name=" + name + "]";
	}
	
	abstract void play(int pos);	// 추상화를 시키면 메서드에 있는 몸체{}가 없어도 상관없다- 미구현(미완성된 메서드)
	abstract void stop(); 	// 추상메서드는 구현부가 없다 그래서 {} 대신, 세미콜론 ; 을 붙여줘야 한다 
	
	
	
	
//	Abstract 접근제어자
//	미구현된
//	추상 클래스
//	추상 메서드
//
//	추상: 낱낱의 구체적 표상이나 개념에서 공통된 성질을 뽑아 이를 일반적인 개념으로 파악하는 정신 작용
//
//	추상화
//	클래스간의 공통점을 찾아내서 공통의 조상을 만드는 작업
//
//	구체화
//	상속을 통해 클래스를 구현, 확장하는 작업

}
