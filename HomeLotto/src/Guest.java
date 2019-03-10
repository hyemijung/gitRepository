public class Guest {
	
	String name = "";
	int age = 0;
	String id ="";
	String idCheck = "";
	
	
	public Guest() {
		super();
		
	}


	public Guest(String name, int age, String id, String idCheck) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.idCheck = idCheck;
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


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getIdCheck() {
		return idCheck;
	}


	public void setIdCheck(String idCheck) {
		this.idCheck = idCheck;
	}


	
	
	
	@Override
	public String toString() {
		return "Guest [name=" + name + ", age=" + age + ", id=" + id + ", idCheck=" + idCheck + "]";
	}
	
	
	
}
