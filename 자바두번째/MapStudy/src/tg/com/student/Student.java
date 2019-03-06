package tg.com.student;

public class Student {

	private String groupName = "";
	private String name = "";
	private int goodLifeScore = 0;
	private int speechWriteScore = 0;
	private int physicalScore = 0;
	private int totalScore = 0;
	private String lifeRecord = "";

	
	
	public Student() {
		super();
	}

	public Student(String groupName, String name, int goodLifeScore, int speechWriteScore, int physicalScore,
			int totalScore, String lifeRecord) {
		super();
		this.groupName = groupName;
		this.name = name;
		this.goodLifeScore = goodLifeScore;
		this.speechWriteScore = speechWriteScore;
		this.physicalScore = physicalScore;
		this.totalScore = totalScore;
		this.lifeRecord = lifeRecord;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGoodLifeScore() {
		return goodLifeScore;
	}

	public void setGoodLifeScore(int goodLifeScore) {
		this.goodLifeScore = goodLifeScore;
	}

	public int getSpeachWriteScore() {
		return speechWriteScore;
	}

	public void setSpeachWriteScore(int speechWriteScore) {
		this.speechWriteScore = speechWriteScore;
	}

	public int getPhysicalScore() {
		return physicalScore;
	}

	public void setPhysicalScore(int physicalScore) {
		this.physicalScore = physicalScore;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public String getLifeRecord() {
		return lifeRecord;
	}

	public void setLifeRecord(String lifeRecord) {
		this.lifeRecord = lifeRecord;
	}

	public void showStudentInfo() {
		System.out.println("반이름:\t \t" + groupName);
		System.out.println("이름:\t \t" + name);
		System.out.println("바른생활:\t \t" + goodLifeScore);
		System.out.println("말하기.쓰기:\t" + speechWriteScore);
		System.out.println("체육:\t \t" + physicalScore);
		System.out.println("총점:\t \t" + totalScore);
		System.out.println("생활기록부:\t" + lifeRecord );
	}

	
	
	
	
	
	
	@Override
	public String toString() {
		return "Student [groupName=" + groupName + ", name=" + name + ", goodLifeScore=" + goodLifeScore
				+ ", speechWriteScore=" + speechWriteScore + ", physicalScore=" + physicalScore + ", totalScore="
				+ totalScore + ", lifeRecord=" + lifeRecord + "]";
	}

}
