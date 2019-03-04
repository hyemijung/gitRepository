
public class TeamPerson {
	private int teamNo = 0;
	private String name = "";
	private int age = 0;
	
	public TeamPerson(){
		
	}
	
	public TeamPerson(int teamNo, String name, int age){
		this.teamNo = teamNo;
		this.name = name;
		this.age = age;
	}


	public int getTeamNo() {
		return teamNo;
	}

	public void setTeamNo(int teamNo) {
		this.teamNo = teamNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println("팀번호: " + teamNo);
		System.out.println("팀원의 이름: " + name);
		System.out.println("팀원의 나이: " + age);
	}
	
	@Override // toString() 코드가 맨마지막에 와야한다(개발차원에서 사용하는 것이므로)
	public String toString() {
		return "TeamPerson [teamNo=" + teamNo + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
